package com.bulletinboard;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Logger;

public class BulletinBoardServer {
    private static final Logger logger = Logger.getLogger(BulletinBoardServer.class.getName());

    private final int port;
    private final Server server;

	public BulletinBoardServer(int port) throws IOException {
		this.port = port;
        this.server = ServerBuilder.forPort(port).addService(new BulletinBoardService()).build();
	}

	public void start() throws IOException {
		server.start();
		logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may has been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                BulletinBoardServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
	}
    /** Stop serving requests and shutdown resources. */
    public void stop() {
        if (server != null) {
            server.shutdown();
        }
    }
    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
	public static void main(String[] args) throws Exception {
        BulletinBoardServer server = new BulletinBoardServer(8980);
        server.start();
        server.blockUntilShutdown();
	}

}
