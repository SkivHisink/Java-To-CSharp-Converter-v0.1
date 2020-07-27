package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    cBagRescueTimeStepGroup.java

    Rod Hanks   Oct 9, 2006

******************************************************************/
public class cBagRescueTimeStepGroup extends RjniBaseClass
{


  protected cBagRescueTimeStepGroup(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cBagRescueTimeStepGroup()
  {
    nativeNdx = Create_cBagRescueTimeStepGroup0();
  }

  public void dispose()
  {
    Delete_cBagRescueTimeStepGroup(nativeNdx);
  }

  public void AddTo(RescueTimeStepGroup newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public boolean RemoveFrom(RescueTimeStepGroup existingObject)
  {
    boolean myReturn = RemoveFrom3(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public RescueTimeStepGroup NthObject(long ordinal)
  {
    long returnNdx = NthObject4(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTimeStepGroup myReturn = new RescueTimeStepGroup(returnNdx);
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

  private native long Create_cBagRescueTimeStepGroup0();
  private native void Delete_cBagRescueTimeStepGroup(long ndx);
  private native void AddTo2(long refNdx
                                 ,long newObject);
  private native boolean RemoveFrom3(long refNdx
                                    ,long existingObject);
  private native long NthObject4(long refNdx
                                 ,long ordinal);
  private native long Count5(long refNdx);
}
