package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    cSetString.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class cSetString extends RjniBaseClass
{


  public cSetString(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cSetString()
  {
    nativeNdx = Create_cSetString0();
  }

  public void dispose()
  {
    Delete_cSetString(nativeNdx);
  }

  public void AddTo(java.lang.String newObject)
  {
    AddTo2(nativeNdx
               ,newObject);
  }

  public boolean RemoveFrom(java.lang.String existingObject)
  {
    boolean myReturn = RemoveFrom3(nativeNdx
                                     ,existingObject);
    return myReturn;
  }

  public java.lang.String NthObject(long ordinal)
  {
    java.lang.String myReturn = NthObject4(nativeNdx
                                     ,ordinal);
    return myReturn;
  }

  public java.lang.String NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
  }

  public long Count64()
  {
    long myReturn = Count5(nativeNdx);
    return myReturn;
  }

  public int Count()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(Count64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int Count(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(Count64(), throwIfTooBig);
  }

  public boolean Contains(java.lang.String example)
  {
    boolean myReturn = Contains6(nativeNdx
                                   ,example);
    return myReturn;
  }

  public void EmptySelf()
  {
    EmptySelf7(nativeNdx);
  }

  private native long Create_cSetString0();
  private native void Delete_cSetString(long ndx);
  private native void AddTo2(long refNdx
                                 ,java.lang.String newObject);
  private native boolean RemoveFrom3(long refNdx
                                    ,java.lang.String existingObject);
  private native java.lang.String NthObject4(long refNdx
                                            ,long ordinal);
  private native long Count5(long refNdx);
  private native boolean Contains6(long refNdx
                                  ,java.lang.String example);
  private native void EmptySelf7(long refNdx);
}
