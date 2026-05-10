package Lesson7.Task_2;

public class Student {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int course;
    private String birthCity;
    private String university;

    private Student(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.birthYear = builder.birthYear;
        this.course = builder.course;
        this.birthCity = builder.birthCity;
        this.university = builder.university;
    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private int birthYear;
        private int course;
        private String birthCity;
        private String university;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setBirthYear(int birthYear) {
            this.birthYear = birthYear;
            return this;
        }

        public Builder setCourse(int course) {
            this.course = course;
            return this;
        }

        public Builder setBirthCity(String birthCity) {
            this.birthCity = birthCity;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", course=" + course +
                ", birthCity='" + birthCity + '\'' +
                ", university='" + university + '\'' +
                '}';
    }
}
