package sportgame;

public class Main {
    public static void main(String[] args) {
        Participant alice = new Human("Alice", 1000, 2);
        Participant bob = new Cat("Bob", 1000, 3);
        Participant robot = new Robot("Eve", 2000, 1);

        Participant[] participants = {alice, bob, robot};
        Obstacle track = new Track(500);
        Obstacle wall = new Wall(0);

        Obstacle[] obstacles = {track, wall};

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle == track) {
                    if (participant.maxRunDistance >= obstacle.overcome()) {
                        participant.run();
                        System.out.println("And pass the track");

                    }
                    if (participant.maxRunDistance < obstacle.overcome()) {
                        participant.run();
                        System.out.println("Not pass track");
                        break;
                    }
                } else {
                    if (participant.maxJumpHeight >= obstacle.overcome()) {
                        participant.jump();
                        System.out.println("And pass the wall");

                    }
                    if (participant.maxJumpHeight < obstacle.overcome()) {
                        participant.jump();
                        System.out.println("Not pass the wall");
                        break;


                    }
                }
            }


        }
    }
}

