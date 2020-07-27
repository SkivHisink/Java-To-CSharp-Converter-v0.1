using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cSetRescueSOctTreeNode : RjniBaseClass
{


  protected cSetRescueSOctTreeNode(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cSetRescueSOctTreeNode()
  {
    nativeNdx = Create_cSetRescueSOctTreeNode0();
  }

  public void dispose()
  {
    Delete_cSetRescueSOctTreeNode(nativeNdx);
  }

  public void AddTo(RescueSOctTreeNode newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public bool RemoveFrom(RescueSOctTreeNode existingObject)
  {
    bool myReturn = RemoveFrom3(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public bool RemoveFrom(long ndx)
  {
    bool myReturn = RemoveFrom4(nativeNdx
                                     ,ndx);
    return myReturn;
  }

  public bool RemoveFrom(int ndx)
  {
    return RemoveFrom((long) ndx);
  }

  public RescueSOctTreeNode NthObject(long ordinal)
  {
    long returnNdx = NthObject5(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueSOctTreeNode myReturn = new RescueSOctTreeNode(returnNdx);
      return myReturn;
    }
  }

  public RescueSOctTreeNode NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
  }

  public long Count64()
  {
    long myReturn = Count6(nativeNdx);
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

  public void EmptySelf()
  {
    EmptySelf7(nativeNdx);
  }

}

}