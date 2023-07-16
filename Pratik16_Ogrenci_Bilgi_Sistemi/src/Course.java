public class Course {
    String name;
    String code;
    String prefix;
    int sozlu_note;
    int note;
    Teacher teacher;

   public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozlu_note = 0;
    }
   public void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix) ){
            this.teacher = teacher;
            System.out.println("Girilen hoca, derse atandı.");
        }
        else{
            System.out.println(teacher.name + " hocayı bu derse atayamazsın.");
        }
    }
   public void printTeacher(){
        if (this.teacher != null){
            System.out.println(this.name + " dersine " + this.teacher.name + " hocası atanmıştır.");
        }
        else{
            System.out.println(this.name + " dersine hoca atanmamıştır.");
        }
    }
}
