import java.util.Scanner;

public class Exercise {
    private final int numberOfClasses;
    private final int numberOfNotes;
    private int[][] notes;

    private Exercise(int numberOfClasses, int numberOfNotes) {
        this.numberOfClasses = numberOfClasses;
        this.numberOfNotes = numberOfNotes;
        initializeNotes();
    }

    private void initializeNotes() {
        notes = new int[numberOfClasses][];
        for (int classIndex = 0; classIndex < notes.length; classIndex++) {
            notes[classIndex] = new int[numberOfNotes];

        }
    }

    private void getNotesFromUser() {
        Scanner scanner = new Scanner(System.in);
        for (int classIndex = 0; classIndex < numberOfClasses; classIndex++) {
            for (int noteIndex = 0; noteIndex < numberOfNotes; noteIndex++) {
                System.out.println("Podaj ocenę nr " + (noteIndex + 1) + " dla przedmiotu nr" + (classIndex + 1) + ":");
                notes[classIndex][noteIndex] = scanner.nextInt();
            }
        }
    }

    private void printAverate() {
        float totalAverage = 0;
        for (int classIndex = 0; classIndex < numberOfClasses; classIndex++) {
            float classAverage = 0;
            for (int note : notes[classIndex]) {
                classAverage += note;
            }
            classAverage /= numberOfNotes;
            System.out.println("Srednia dla przedmiotu nr:" + (classIndex + 1) + "wynosi" + classAverage);
            totalAverage += classAverage;
        }
        totalAverage /= numberOfClasses;
        System.out.println("Srednia ocen dla wszystkich przedmiotów wynosi:" + totalAverage);
    }


    public static void main (String[]args){
            int numberOfClasses = 3;
            int numberOfNotes = 4;
            Exercise exercise = new Exercise(numberOfClasses, numberOfNotes);
            exercise.getNotesFromUser();
            exercise.printAverate();

        }
    }

