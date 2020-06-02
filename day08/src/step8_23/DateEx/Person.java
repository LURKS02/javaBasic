package step8_23.DateEx;

import java.util.Date;

/*
 * Value Object : �� ���� �����Ϳ� �����͸� ó���� �޼ҵ尡 ���ǵ� Ŭ����
 * bean : �ּ� �۾� ����. ó���� �����͸� ����� ��� ���
 * 		   ��� ����, �ʵ�� �����ҿ� �����͸� ������� �� �ִ� getters & setters �޼ҵ�θ� ������ Ŭ����
 */

public class Person {
	/*
	 * ������� ����
	 * ��������� ������ �� =�� �̿��� �ʱ�ȭ
	 * �ʱ�ȭ��Ű�� ���� ���
	 * ���ڴ� 0, boolean�� false, ��ü�� null�� �ڵ� �ʱ�ȭ
	 * 
	 * ��������� ������ ����(static)��������� �ν��Ͻ� ��������� ����
	 * ���� ��������� ���� Ŭ������ ������ ��� ��ü���� ������ ���
	 * �ν��Ͻ� ��������� ���� Ŭ������ ������ ��� ��ü���� ������ ��� ������ ����
	 * ���� ��������� ��ü�� �������� �ʰ� ���� ����
	 */
	
	//���� ���� ������ [static] �ڷ��� ������ [= �ʱ�ȭ]
	public static int count; //���� �������
	private int no;
	private String name;
	private boolean gender;
	private String memo;
	private Date writeDate;
	
	/*
	 * ������
	 * ������ �޼ҵ� ����
	 * ������ �̸��� �ݵ�� Ŭ���� �̸��� �����ؾ���
	 * �����ڴ� ��ü�� �����Ǵ� ���� �ڵ����� ���� (��� ������ �ʱ�ȭ)
	 * �����ڸ� �������� ������ �⺻ �����ڰ� �ڵ����� �������
	 * �����ڸ� �����ϸ� �⺻ �����ڴ� ��������� ����
	 * �����ڴ� return Ÿ���� ������ �ʰ�, return�� ������� �ʴ´�.
	 */
	
	public Person() {
		//���� Ŭ������ �ٸ� �����ڸ� ȣ��
		this("����", true, "����");
	}
	
	public Person(String name, boolean gender, String memo) {
		
		/*
		 * super()�� this()�� �ݵ�� �������� ù ���忡 ��� (����X)
		 * super() : �θ� Ŭ������ ������
		 * this() : ���� Ŭ������ �ٸ� ������
		 * super : �θ� Ŭ����
		 * this : ���� Ŭ����
		 */
		
		no = ++count;
		this.name = name;
		this.gender = gender;
		this.memo = memo;
		writeDate = new Date();
	}
	
	//getters & setters �޼ҵ� ����
	//private ������ ������ ����� ����� ���� ���
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
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
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public Date getWriteDate() {
		return writeDate;
	}
	
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
}

