using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cBagRescueTimeStepGroup : RjniBaseClass
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

  public bool RemoveFrom(RescueTimeStepGroup existingObject)
  {
    bool myReturn = RemoveFrom3(nativeNdx
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

  public int Count(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(Count64(), throwIfTooBig);
  }

}

}