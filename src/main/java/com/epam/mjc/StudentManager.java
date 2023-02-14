package com.epam.mjc;


public class StudentManager {

    private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public Student find(long studentID) {
        if (studentID > 0 && studentID < IDs.length) {
            return Student.getValueOf(studentID);
        } else {
            throw new CustomException("Could not find student with ID " + studentID);
        }
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        for (long id : IDs) {
            try {
                Student student = manager.find(id);
                System.out.println("Student name " + student.getName());
            } catch (CustomException e) {
                System.err.print(e);
            }
        }

    }
}