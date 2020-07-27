package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    cBagRescueStairSteppedFault.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class cBagRescueStairSteppedFault extends RjniBaseClass
{


  protected cBagRescueStairSteppedFault(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cBagRescueStairSteppedFault()
  {
    nativeNdx = Create_cBagRescueStairSteppedFault0();
  }

  public void dispose()
  {
    Delete_cBagRescueStairSteppedFault(nativeNdx);
  }

  public void AddTo(RescueStairSteppedFault newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public boolean RemoveFrom(RescueStairSteppedFault existingObject)
  {
    boolean myReturn = RemoveFrom3(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public RescueStairSteppedFault NthObject(long ordinal)
  {
    long returnNdx = NthObject4(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueStairSteppedFault myReturn = new RescueStairSteppedFault(returnNdx);
      return myReturn;
    }
  }

  public RescueStairSteppedFault NthObject(int ordinal)
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

  public int Count(boolean throwIfTooBig) throws Exception
  {
    return RescueContext.Return32For64(Count64(), throwIfTooBig);
  }

  private native long Create_cBagRescueStairSteppedFault0();
  private native void Delete_cBagRescueStairSteppedFault(long ndx);
  private native void AddTo2(long refNdx
                                 ,long newObject);
  private native boolean RemoveFrom3(long refNdx
                                    ,long existingObject);
  private native long NthObject4(long refNdx
                                 ,long ordinal);
  private native long Count5(long refNdx);
}
