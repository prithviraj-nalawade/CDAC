package org.arrays;

import java.util.Scanner;

class AirplaneSeating {
    private boolean[][] seats;
    private int rows, cols;

    public AirplaneSeating(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        seats = new boolean[rows][cols];
    }

    public void bookSeat(int row, int col) {
        if (isSeatAvailable(row, col)) {
            seats[row][col] = true;
            System.out.println("Seat (" + row + ", " + col + ") booked successfully.");
        } else {
            System.out.println("Seat (" + row + ", " + col + ") is already occupied.");
        }
    }

    public void cancelBooking(int row, int col) {
        if (!isSeatAvailable(row, col)) {
            seats[row][col] = false;
            System.out.println("Booking for seat (" + row + ", " + col + ") canceled.");
        } else {
            System.out.println("Seat (" + row + ", " + col + ") is already available.");
        }
    }

    public boolean isSeatAvailable(int row, int col) {
        return !seats[row][col];
    }

    public void displaySeatingChart() {
        System.out.println("Seating Chart (O = Available, X = Occupied):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(seats[i][j] ? "X " : "O ");
            }
            System.out.println();
        }
    }
}

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        AirplaneSeating seating = new AirplaneSeating(rows, cols);

        int choice;
        do {
            System.out.println("\n1. Book Seat\n2. Cancel Booking\n3. Check Availability\n4. Display Seating Chart\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter row and column to book (0-based index): ");
                    int rowBook = sc.nextInt();
                    int colBook = sc.nextInt();
                    seating.bookSeat(rowBook, colBook);
                    break;
                case 2:
                    System.out.print("Enter row and column to cancel (0-based index): ");
                    int rowCancel = sc.nextInt();
                    int colCancel = sc.nextInt();
                    seating.cancelBooking(rowCancel, colCancel);
                    break;
                case 3:
                    System.out.print("Enter row and column to check availability (0-based index): ");
                    int rowCheck = sc.nextInt();
                    int colCheck = sc.nextInt();
                    if (seating.isSeatAvailable(rowCheck, colCheck)) {
                        System.out.println("Seat (" + rowCheck + ", " + colCheck + ") is available.");
                    } else {
                        System.out.println("Seat (" + rowCheck + ", " + colCheck + ") is occupied.");
                    }
                    break;
                case 4:
                    seating.displaySeatingChart();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
