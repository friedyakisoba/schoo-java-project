/*
@author: Blanca Polo
*/

public interface HListI{
   //public HList( );  //constructors cannot be specified in an interface
   abstract void addHouse(House h);
   abstract void removeHouse(int mls);
   abstract void printAll( );
   abstract void printLower(double price);


}