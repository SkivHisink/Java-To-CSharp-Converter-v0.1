package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    cBagRescueProperty.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class cBagRescueProperty extends RjniBaseClass
{
  protected cBagRescueProperty(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cBagRescueProperty()
  {
    nativeNdx = Create_cBagRescueProperty0();
  }

  public void dispose()
  {
    Delete_cBagRescueProperty(nativeNdx);
  }

  public void AddTo(RescueProperty newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public boolean RemoveFrom(RescueProperty existingObject)
  {
    boolean myReturn = RemoveFrom3(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public RescueProperty NthObject(long ordinal)
  {
    long returnNdx = NthObject4(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueProperty myReturn = new RescueProperty(returnNdx);
      return myReturn;
    }
  }

  public RescueProperty NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
  }

  public RescueProperty PropertyNamed(java.lang.String name)
  {
    long returnNdx = PropertyNamed6(nativeNdx
                                    ,name);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueProperty myReturn = new RescueProperty(returnNdx);
      return myReturn;
    }
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

  private native long Create_cBagRescueProperty0();
  private native void Delete_cBagRescueProperty(long ndx);
  private native void AddTo2(long refNdx
                                 ,long newObject);
  private native boolean RemoveFrom3(long refNdx
                                    ,long existingObject);
  private native long NthObject4(long refNdx
                                 ,long ordinal);
  private native long Count5(long refNdx);
  private native long PropertyNamed6(long refNdx
                                      ,java.lang.String name);
}
