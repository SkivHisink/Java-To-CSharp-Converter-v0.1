package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    cBagInt.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class cBagInt extends RjniBaseClass
{


  protected cBagInt(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cBagInt()
  {
    nativeNdx = Create_cBagInt0();
  }

  public void dispose()
  {
    Delete_cBagInt(nativeNdx);
  }

  public void AddTo(int newObject)
  {
    AddTo2(nativeNdx
               ,newObject);
  }

  public boolean RemoveFrom(long existingObject)
  {
    boolean myReturn = RemoveFrom3(nativeNdx
                                     ,existingObject);
    return myReturn;
  }

  public long NthObject(long ordinal)
  {
    long myReturn = NthObject4(nativeNdx
                             ,ordinal);
    return myReturn;
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

  public int Count(boolean throwIfTooBig) throws Exception
  {
    return RescueContext.Return32For64(Count64(), throwIfTooBig);
  }

  public boolean Contains(long example)
  {
    boolean myReturn = Contains6(nativeNdx
                                   ,example);
    return myReturn;
  }

  private native long Create_cBagInt0();
  private native void Delete_cBagInt(long ndx);
  private native void AddTo2(long refNdx
                                 ,long newObject);
  private native boolean RemoveFrom3(long refNdx
                                    ,long existingObject);
  private native long NthObject4(long refNdx
                               ,long ordinal);
  private native long Count5(long refNdx);
  private native boolean Contains6(long refNdx
                                  ,long example);
}
