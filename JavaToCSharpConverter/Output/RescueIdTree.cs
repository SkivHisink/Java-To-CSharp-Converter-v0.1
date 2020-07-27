using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueIdTree : RjniBaseClass
{


  protected RescueIdTree(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueIdTree()
  {
    nativeNdx = Create_RescueIdTree0();
  }

  public void dispose()
  {
    Delete_RescueIdTree(nativeNdx);
  }

  public void Add(RescueObject newObject)
  {
    Add2(nativeNdx
        ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public bool Delete(RescueObject existingObject)
  {
    bool myReturn = Delete3(nativeNdx
                                 ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public RescueObject Find(long identifier)
  {
    long returnNdx = Find4(nativeNdx
                           ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueObject myReturn = new RescueObject(returnNdx);
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