import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagerTest {
    public static void main(String[] args) {

        //创建一个集合
        List<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        lo:
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出");
            System.out.println("请输入您的选择:");

            int chose = sc.nextInt();

            switch (chose) {
                case 1:
                    insert(list);
                    break;
                case 2:
                    remove(list);
                    break;
                case 3:
                    update(list);
                    break;
                case 4:
                    select(list);
                    break;
                case 5:
                    System.out.println("感谢您的使用");
                    break lo;
                default:
                    System.out.println("输入有误");
                    break;
            }


        }
    }
    public static void select(List<Student> list){
        if (list.size()==0){
            System.out.println("查无信息！");
        }else {
            System.out.println("学号\t\t\t姓名\t年龄\t生日\t");
            for (Student student : list) {
                System.out.println(student.getId()+"---"+student.getName()+"---"+student.getAge()+"---"+student.getBirthday());
            }
        }
    }
    public static void remove(List<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号");
        String id = sc.next();
        int size = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)){
                list.remove(i);
            }
        }
        if (size==list.size()){
            System.out.println("未找到当前学号");
        }
    }
    public static void insert(List<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号");
        String id = sc.next();
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("请输入生日");
        String birthday = sc.next();
        Student st = new Student(id,name,age,birthday);
        list.add(st);
    }
    public static void update(List<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号");
        String id = sc.next();
        int index  = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)){
                index=i;
            }
        }
        Student student = list.get(index);
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("请输入生日");
        String birthday = sc.next();
        student.setName(name);
        student.setAge(age);
        student.setBirthday(birthday);
    }
}
