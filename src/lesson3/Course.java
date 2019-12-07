package lesson3;

class Course {
    int courseId;
    String courseName;
    int openSpaces;
    Student[] studentList;

    Course(int courseId, String courseName, int openSpaces){
        this.courseId = courseId;
        this.courseName = courseName;
        this.openSpaces = openSpaces;
        this.studentList = new Student[openSpaces];
    }

    public String toString(){
        return ("Course Id: " + courseId
                + " Course name: " + courseName
                + " # open spaces: " + openSpaces);
    }

    boolean book(Student student) {
        if (this.openSpaces > 0) {
            this.studentList[openSpaces - 1] = student;
            this.openSpaces = this.openSpaces - 1;
            return true;
        }
        return false;
    }

    String createParticipantList(){
        String participantList="";
        for (Student student:this.studentList){
            if (student!=null){
                participantList = participantList + student.toString() +"\n";
            }
        }
        return participantList;
    }
}