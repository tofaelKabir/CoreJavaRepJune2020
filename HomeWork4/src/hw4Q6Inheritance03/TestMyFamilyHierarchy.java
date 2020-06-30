package hw4Q6Inheritance03;

/*
 Q6. Create a package name "hw4Q6Inheritance03" in HW project. Inside the package, a) Create your family hierarchy and call according to the hierarchy. Follow from Grandfather to Great grand children. Explain Single inheritance, Multilevel and Hierarchical inheritance.
 * */

public class TestMyFamilyHierarchy {

	public static void main(String[] args) {
		System.out.println("\n*************************");
		MyGrandfather grandfather = new MyGrandfather(); //MyGrandfather is a hierarchical inheritance
        grandfather.grandfatherInfo();
		
        System.out.println("\n*************************");
        MyFather father = new MyFather(); //MyFather is a single inheritance
        father.fatherInfo();
        father.grandfatherInfo();
        
        System.out.println("\n*************************");
        Me mySelf = new Me();
        mySelf.myInfo();
        
        System.out.println("\n*************************");
        MySister sister = new MySister(); //MySister is one of the multilevel inheritance
        sister.sisterInfo();
        sister.fatherInfo();
        sister.grandfatherInfo();
        
        System.out.println("\n*****************************");
		MySon son = new MySon();
		son.sonInfo();
		
		System.out.println("\n*****************************");
		MyNiece niece = new MyNiece();
		niece.nieceInfo();
		niece.sisterInfo();
		niece.fatherInfo();
		niece.grandfatherInfo();
		
		System.out.println("\n*****************************");
		MyGrandChild grandChild = new MyGrandChild();
		grandChild.grandchildInfo();
		grandChild.nieceInfo();
		grandChild.sisterInfo();
		grandChild.fatherInfo();
		grandChild.grandfatherInfo();
		
        
     //The comment out are not right   

	}

}
