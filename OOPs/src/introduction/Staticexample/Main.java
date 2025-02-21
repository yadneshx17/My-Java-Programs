package introduction.Staticexample;


public class Main {
	public static void main(String[] args) {
		// Objects
		Human kunal = new Human(22, "kunal",10000, false );
		Human rahul = new Human(22, "rahul",10000, false );
		Human arpit = new Human(22, "arpit",10000, false );

		// Whenever Accessing static or modifying static variable, Don't do it via the Object name.
		// 
		System.out.println(Human.population);
		System.out.println(Human.population);
		System.out.println(Human.population);


 
		// non-static method cannot be referenced/access   through a static method this(main function).
		// greeting();

		Main funn = new Main();
        funn.fun2();

	}
	// at last every thing you right in the program is gonna call by static method ( main function )
	// in the end every thing is gonna called in static function( main ).




	 static void fun() {
//        greeting(); // you cant use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you cannot access non static stuff without referencing their instances in
        // a static context

        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();	
    	}

	void fun2(){
		greeting();
	}


	// non-static function - dependent on instance/objects.
	// we know that something which is not static, belongs to an object.
	// 
	void greeting(){
		fun(); // can use static in non static
		System.out.println("Hello World");
	}
}
