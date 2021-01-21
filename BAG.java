package bag;
import java.util.Scanner;
import java.util.Random;
public class BAG {
static Scanner sc = new Scanner(System.in);
static Scanner sc_string = new Scanner (System.in);
    public static void main(String[] args) {
MyLinkedList<Object> list = new MyLinkedList<>();
MyLinkedList list2 = new MyLinkedList<>();
MyLinkedList list_elementsize = new MyLinkedList<>();
int a;
System.out.println("Which action would you like to do?");
System.out.println("ENTER 1'ONE' FOR ADD");
System.out.println("ENTER 2'TWO' FOR CLEAR");
System.out.println("ENTER 3'TWELVE' FOR CONTAINS");
System.out.println("ENTER 4'FOUR' FOR DISTINCSIZE");
System.out.println("ENTER 5'FIVE' FOR EQUALS");
System.out.println("ENTER 6'SIX' FOR ELEMENTSIZE");
System.out.println("ENTER 7'SEVEN' FOR ISEMPTY");
System.out.println("ENTER 8'EIGHT' FOR REMOVE");
System.out.println("ENTER 9'NINE' FOR SIZE");
System.out.println("ENTER 10'TEN' FOR TOSTRING");
a = sc.nextInt();
while(true){    
    while(a>10 || a<0){
        System.out.println("Please, enter 1-10");
        a = sc.nextInt();
    }
    if(a == 0)
        break;
        if(a == 1){//ADD
            System.out.println("How many input u will enter");  
            System.out.println("You will must enter natural number.");
            System.out.println("Enter 0 if you give up");
            int n = sc.nextInt();
                while(n < 0){
                    System.out.println("Incorrected Entry!");
                    System.out.println("Please, enter natural number.");
                    n = sc.nextInt();
                }   
            int i = 0;
            if(n > 0)
            System.out.println("ENTER ANY VALUES(ADD PROCESS)");
                while (i < n) {
                Object thing;
                thing = sc.next();
                list.add(thing);
                i++;
                }
if(list.size()==0)
    System.out.println("THE BAG IS EMPTY");
else
System.out.println("Your bag is: \t"+list.toString());
System.out.println("Which action would you like to do?");
System.out.println("1 ADD - 2 CLEAR - 3 CONTAINS - 4 DISTINCSIZE - 5 EQUALS");
System.out.println("6 ELEMENTSIZE - 7 ISEMPTY - 8 REMOVE - 9 SIZE - 10 TOSTRING");
    a = sc.nextInt();
            }
        if(a == 2){//CLEAR
            list.clear();
            System.out.println("You erased everything");
if(list.size()==0)
    System.out.println("THE BAG IS EMPTY");
else
System.out.println("Your bag is: \t"+list.toString());
System.out.println("Which action would you like to do?");
System.out.println("1 ADD - 2 CLEAR - 3 CONTAINS - 4 DISTINCSIZE - 5 EQUALS");
System.out.println("6 ELEMENTSIZE - 7 ISEMPTY - 8 REMOVE - 9 SIZE - 10 TOSTRING");
    a = sc.nextInt();
            }
        if(a == 3){//CONTAIN
            Object b;
            System.out.println("Enter the thing you are looking for");
            b = sc_string.next();
            //System.out.println(b);
            int count = 0;
            int size = list.size();
            size = size-1;
                while(size >= 0){
                if(list.get(size).equals(b))
                    count = 1;
                    size--;
                    }
                if(count == 1)
                    System.out.println("Your bag has the value.");
                else
                    System.out.println("Your bag doesn't have the value.");
if(list.size()==0)
    System.out.println("THE BAG IS EMPTY");
else
System.out.println("Your bag is: \t"+list.toString());                
System.out.println("Which action would you like to do?");
System.out.println("1 ADD - 2 CLEAR - 3 CONTAINS - 4 DISTINCSIZE - 5 EQUALS");
System.out.println("6 ELEMENTSIZE - 7 ISEMPTY - 8 REMOVE - 9 SIZE - 10 TOSTRING");
    a = sc.nextInt();
            }
        if(a == 4){//DISTINCSIZE
            int si = list.size();
            for(int u = 0; u < si ; u++){
                list2.add(list.get(u));
            }
            for(int h = 0; h < si ; h++){
                for(int q = 0; q < si ; q++){
                    for(int p = q+1; p < si ; p++){
                        if(list.get(q).equals(list2.get(p))){
                            list2.remove(p);
                            si--;
                        }
            }}}
            int k = list2.size();
            System.out.println("Bag's distinct size is \t"+k);
           list2.clear();
if(list.size()==0)
    System.out.println("THE BAG IS EMPTY");
else
System.out.println("Your bag is: \t"+list.toString());
System.out.println("Which action would you like to do?");
System.out.println("1 ADD - 2 CLEAR - 3 CONTAINS - 4 DISTINCSIZE - 5 EQUALS");
System.out.println("6 ELEMENTSIZE - 7 ISEMPTY - 8 REMOVE - 9 SIZE - 10 TOSTRING");
    a = sc.nextInt();
            }
        if(a == 5){//EQUALS
            Object c;
            System.out.println("Enter the thing your are looking for");
            c = sc_string.next();
    System.out.println(list.equals(c, list));
if(list.size()==0)
    System.out.println("THE BAG IS EMPTY");
else
System.out.println("Your bag is: \t"+list.toString());                
System.out.println("Which action would you like to do?");
System.out.println("1 ADD - 2 CLEAR - 3 CONTAINS - 4 DISTINCSIZE - 5 EQUALS");
System.out.println("6 ELEMENTSIZE - 7 ISEMPTY - 8 REMOVE - 9 SIZE - 10 TOSTRING");
    a = sc.nextInt();
            }
        if(a == 6){//ELEMENTSIZE
            int listsize = list.size();
            if(listsize>0)
            {   
                for(int u2 = 0; u2 < listsize ; u2++){
                list2.add(list.get(u2));
            }
            for(int h = 0; h < listsize ; h++){
                for(int q = 0; q < listsize ; q++){
                    for(int p = q+1; p < listsize ; p++){
                        if(list.get(q).equals(list2.get(p))){
                            list2.remove(p);
                            listsize--;
                        }
            }}}
            int countsize;
            listsize = list.size();
            int list2size = list2.size();
            for(int m = 0 ; m < list2size ; m++){
                countsize = 0;
                for(int n = 0; n < listsize ; n++){
                    if(list2.get(m).equals(list.get(n)))
                        countsize++;
                }
            list_elementsize.add(countsize);
            }
            for(int m = 0 ; m<list2size; m++){
                System.out.println(list2.get(m)+"\t has \t "+list_elementsize.get(m));
            }
            list2.clear();//distinct list
            list_elementsize.clear();//all value is number
            }
            else
                System.out.println("No action is required\t"+"EMPTY");
if(list.size()==0)
    System.out.println("THE BAG IS EMPTY");
else
System.out.println("Your bag is: \t"+list.toString());                
System.out.println("Which action would you like to do?");
System.out.println("1 ADD - 2 CLEAR - 3 CONTAINS - 4 DISTINCSIZE - 5 EQUALS");
System.out.println("6 ELEMENTSIZE - 7 ISEMPTY - 8 REMOVE - 9 SIZE - 10 TOSTRING");
    a = sc.nextInt();
            }
        if(a == 7){//ISEMPTY
            boolean empty = list.isEmpty();
            System.out.println(empty);
if(list.size()==0)
    System.out.println("THE BAG IS EMPTY");
else
System.out.println("Your bag is: \t"+list.toString());
System.out.println("Which action would you like to do?");
System.out.println("1 ADD - 2 CLEAR - 3 CONTAINS - 4 DISTINCSIZE - 5 EQUALS");
System.out.println("6 ELEMENTSIZE - 7 ISEMPTY - 8 REMOVE - 9 SIZE - 10 TOSTRING");
    a = sc.nextInt();
            }
        if(a == 8){//REMOVE
            int s = list.size();
            System.out.println("Do you have a preference?\t"+"\t Always I will erase reached data the first one.");
            System.out.println("If you've, please, enter the 1.");
            System.out.println("If you don't have, enter any number");
            int g = sc.nextInt();
            if(g == 1){
                int f = 0;
            System.out.println(list.toString());
            Object d;
            System.out.println("Enter what you want to remove");
            d = sc_string.next();
            int d2 = list.size();
            for(int d3 = 0; d3 < d2 ; d3++){
                if(d.equals(list.get(d3))){
                    System.out.println("Value to delete:\t"+list.get(d3));
                    list.remove(d3);
                    System.out.println("TRUE"); 
                    f = 1;
                    d3 = d2;
                }
            }
            if(f == 0)
                System.out.println("FALSE \t" + "\t Something like that doesn't exist in the bag.");
            }
            else{
            if(s>0){    
                Random r = new Random();
                int ra;
                ra = r.nextInt(s);
                System.out.println("Value to delete\t"+list.get(ra));
                list.remove(ra);
                System.out.println("TRUE"); 
            }
            else
                System.out.println("FALSE"+"\n"+"This array has insufficient elements");
            }
if(list.size()==0)
    System.out.println("THE BAG IS EMPTY");
else
System.out.println("Your bag is: \t"+list.toString());
System.out.println("Which action would you like to do?");
System.out.println("1 ADD - 2 CLEAR - 3 CONTAINS - 4 DISTINCSIZE - 5 EQUALS");
System.out.println("6 ELEMENTSIZE - 7 ISEMPTY - 8 REMOVE - 9 SIZE - 10 TOSTRING");
    a = sc.nextInt();
            }
        if(a == 9){//SIZE                    
            int p = list.size();
            System.out.println("YOUR BAG'S SIZE IS:\t"+p);
if(list.size()==0)
    System.out.println("THE BAG IS EMPTY");
else
System.out.println("Your bag is: \t"+list.toString());
System.out.println("Which action would you like to do?");
System.out.println("1 ADD - 2 CLEAR - 3 CONTAINS - 4 DISTINCSIZE - 5 EQUALS");
System.out.println("6 ELEMENTSIZE - 7 ISEMPTY - 8 REMOVE - 9 SIZE - 10 TOSTRING");
    a = sc.nextInt();
            }
        if(a == 10){//TOSTRING
            list.toString();
            System.out.println("YOUR BAG IS:\t"+list.toString());
if(list.size()==0)
    System.out.println("THE BAG IS EMPTY");
else
System.out.println("Your bag is: \t"+list.toString());
System.out.println("Which action would you like to do?");
System.out.println("1 ADD - 2 CLEAR - 3 CONTAINS - 4 DISTINCSIZE - 5 EQUALS");
System.out.println("6 ELEMENTSIZE - 7 ISEMPTY - 8 REMOVE - 9 SIZE - 10 TOSTRING"); 
    a = sc.nextInt();
            }
}}}