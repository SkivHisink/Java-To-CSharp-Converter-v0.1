package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    cSetRescuePolyLineNode.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class cSetRescuePolyLineNode extends RjniBaseClass
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

  public boolean AddTo(RescuePolyLineNode newObject)
  {
    boolean myReturn = AddTo2(nativeNdx
                                     ,(newObject == null) ? 0 : newObject.nativeNdx);
    return myReturn;
  }

  public boolean RemoveFrom(RescuePolyLineNode existingObject)
  {
    boolean myReturn = RemoveFrom3(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public boolean RemoveFrom(long ndx)
  {
    boolean myReturn = RemoveFrom4(nativeNdx
                                     ,ndx);
    return myReturn;
  }

  public boolean RemoveFrom(int ndx)
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

  public RescuePolyLineNode ObjectNamed(java.lang.String nameIn)
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

  public int Count(boolean throwIfTooBig) throws RuntimeException
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

  private native long Create_cSetRescuePolyLineNode0(long parentIn);
  private native void Delete_cSetRescuePolyLineNode(long ndx);
  private native boolean AddTo2(long refNdx
                                    ,long newObject);
  private native boolean RemoveFrom3(long refNdx
                                    ,long existingObject);
  private native boolean RemoveFrom4(long refNdx
                                    ,long ndx);
  private native long NthObject5(long refNdx
                                 ,long ordinal);
  private native long ObjectNamed6(long refNdx
                                   ,java.lang.String nameIn);
  private native long ObjectIdentifiedBy7(long refNdx
                                          ,long identifier);
  private native long Count8(long refNdx);
  private native void EmptySelf9(long refNdx);
  private native void Relink12(long refNdx
                              ,long parent);
}
