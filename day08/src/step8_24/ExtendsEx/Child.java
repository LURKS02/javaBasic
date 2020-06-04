package step8_24.ExtendsEx;

//�θ� (����,����,���) Ŭ����
class Parent {
	
	//private String name;
	//private boolean gender;
	protected String name;
	protected boolean gender;
	
	public Parent() {
		//���� Ŭ������ �ٸ� ������
		//Parent(String name, boolean gender)�� ����
		this("����", true);
		System.out.println("�θ� Ŭ������ �⺻ ������ ����");
	}
	
	public Parent(String name, boolean gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isGender() {
		return gender;
	}
	
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return name + "(" + (gender? "��" : "��") + ")";
	}
}

//�ڽ� (����,����,�Ļ�) Ŭ����
//��� ���� : class �ڽ�Ŭ���� extends �θ�Ŭ����
//�ڹٴ� ���߻�� ����x
public class Child extends Parent{
	private int age;
	private String nickName;
	
	public Child() {
		super();
		System.out.println("�ڽ� Ŭ������ �⺻ ������ ����");
	}
	
	public Child(String name, boolean gender, int age, String nickName) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.nickName = nickName;
	}
	
	@Override
	//��ӿ��� �Լ���� ����Ÿ��, �Ű������� ���� �Լ��� �θ�/�ڽ�Ŭ�������� ������ ���ִ� ��
	public String toString() {
		return name + "(" + (gender ? "��" : "��") + ") - " + age + ", " + nickName;
	}
	
	public static void main(String[] args) {
		Parent parent = new Parent();
		System.out.println(parent);
		Parent parent2 = new Parent("������", false);
		System.out.println(parent2);
		System.out.println("======================");
		
		//�ڽ� Ŭ���� �����ڰ� ���� �����Ǳ� ���� �θ� Ŭ���� �����ڰ� ���� ����
		Child child = new Child();
		System.out.println(child);
		System.out.println("===");
		Child child2 = new Child("�Ӳ���", true, 42, "����");
		System.out.println(child2);
		
	}
}

