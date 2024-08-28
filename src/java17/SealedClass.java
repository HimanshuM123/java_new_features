package java17;

sealed  class SealedClass permits SubClassOne, SubClassTwo{

}


final class SubClassOne extends SealedClass
{
    //Final Sub Class
}
 
final class SubClassTwo extends SealedClass
{
    //Final Sub Class
}

//compile time error
//final class SubClassThree extends SealedClass
//{
//   
//}