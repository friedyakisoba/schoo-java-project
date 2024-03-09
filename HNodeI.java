/*
@author: Blanca Polo
*/


public interface HNodeI{
//public HNode(House h); //constructors cannot be specified in an interface
   abstract void setHouse(House house);
   abstract House getHouse( );
   abstract void setNext(HNode next);
   abstract HNode getNext( );
   abstract String toString( );

}