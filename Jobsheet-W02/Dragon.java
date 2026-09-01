public class Dragon {
    int x;
    int y;
    int direction;

    public Dragon() {
        x = 0;
        y = 0;
        direction = 1;
    }

    public Dragon(int x, int y, int direction) {
        this.x = x;
        this.y = y;

        if (direction >= 1 && direction <= 4) {
            this.direction = direction;
        } else {
            this.direction = 1;
        }
    }

    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        }
    }

    public void move(int steps) {
        if (direction == 1) {
            y += steps;
        } else if (direction == 2) {
            x += steps;
        } else if (direction == 3) {
            y -= steps;
        } else if (direction == 4) {
            x -= steps;
        }
    }

    public void printStatus() {
        System.out.println("Posisi X: " + x);
        System.out.println("Posisi Y: " + y);

        if (direction == 1) {
            System.out.println("Arah: Atas");
        } else if (direction == 2) {
            System.out.println("Arah: Kanan");
        } else if (direction == 3) {
            System.out.println("Arah: Bawah");
        } else if (direction == 4) {
            System.out.println("Arah: Kiri");
        }

        System.out.println("====================");
    }
}