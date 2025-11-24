import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.MultiplicationService;

import java.io.IOException;

public class MultiplicationServer {
    public static void main(String[] args) throws IOException,
            InterruptedException {
        Server server = ServerBuilder.forPort(8881)
                .addService(new MultiplicationService())
                .build();
        server.start();
        System.out.println("Serveur gRPC démarré sur le port "+ server.getPort());
        server.awaitTermination();
    }
}
