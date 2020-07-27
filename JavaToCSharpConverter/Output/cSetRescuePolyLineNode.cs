using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cSetRescuePolyLineNode : RjniBaseClass
{


  protected cSetRescuePolyLineNode(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cSetRescuePolyLineNode(RescuePolyLine parentIn)
  {
    nativeNdx = Create_cSetRescuePolyLineNode0((parentIn == null) ? 0 : parentIn.nativeNdx);
  }

  public void dispose()
  {
    Delete_cSetRescuePolyLineNode(nativeNdx);
  }

  public bool AddTo(RescuePolyLineNode newObject)
  {
    bool myReturn = AddTo2(nativeNdx
                                     ,(newObject == null) ? 0 : newObject.nativeNdx);
    return myReturn;
  }

  public bool RemoveFrom(RescuePolyLineNode existingObject)
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

  public RescuePolyLineNode NthObject(long ordinal)
  {
    long returnNdx = NthObject5(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePolyLineNode myReturn = new RescuePolyLineNode(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueTrimVertex:
        myReturn = new RescueTrimVertex(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public RescuePolyLineNode NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
  }

  public RescuePolyLineNode ObjectNamed(string nameIn)
  {
    long returnNdx = ObjectNamed6(nativeNdx
                                  ,nameIn);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePolyLineNode myReturn = new RescuePolyLineNode(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueTrimVertex:
        myReturn = new RescueTrimVertex(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public RescuePolyLineNode ObjectIdentifiedBy(long identifier)
  {
    long returnNdx = ObjectIdentifiedBy7(nativeNdx
                                         ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePolyLineNode myReturn = new RescuePolyLineNode(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueTrimVertex:
        myReturn = new RescueTrimVertex(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public RescuePolyLineNode ObjectIdentifiedBy(int identifier)
  {
    return ObjectIdentifiedBy((long) identifier);
  }

  public long Count64()
  {
    long myReturn = Count8(nativeNdx);
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
    EmptySelf9(nativeNdx);
  }

  public void Relink(RescueObject parent)
  {
    Relink12(nativeNdx
           ,(parent == null) ? 0 : parent.nativeNdx);
  }

}

}