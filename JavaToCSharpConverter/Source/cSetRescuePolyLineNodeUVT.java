package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    cSetRescuePolyLineNodeUVT.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class cSetRescuePolyLineNodeUVT extends RjniBaseClass
{


  protected cSetRescuePolyLineNodeUVT(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cSetRescuePolyLineNodeUVT()
  {
    nativeNdx = Create_cSetRescuePolyLineNodeUVT0();
  }

  public void dispose()
  {
    Delete_cSetRescuePolyLineNodeUVT(nativeNdx);
  }

  public void AddTo(RescuePolyLineNodeUVT newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public boolean RemoveFrom(RescuePolyLineNodeUVT existingObject)
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

  public RescuePolyLineNodeUVT NthObject(long ordinal)
  {
    long returnNdx = NthObject5(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePolyLineNodeUVT myReturn = new RescuePolyLineNodeUVT(returnNdx);
      return myReturn;
    }
  }

  public RescuePolyLineNodeUVT NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
  }

  public RescuePolyLineNodeUVT ObjectNamed(java.lang.String nameIn)
  {
    long returnNdx = ObjectNamed6(nativeNdx
                                  ,nameIn);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePolyLineNodeUVT myReturn = new RescuePolyLineNodeUVT(returnNdx);
      return myReturn;
    }
  }

  public RescuePolyLineNodeUVT ObjectIdentifiedBy(long identifier)
  {
    long returnNdx = ObjectIdentifiedBy7(nativeNdx
                                         ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePolyLineNodeUVT myReturn = new RescuePolyLineNodeUVT(returnNdx);
      return myReturn;
    }
  }

  public RescuePolyLineNodeUVT ObjectIdentifiedBy(int identifier)
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

  private native long Create_cSetRescuePolyLineNodeUVT0();
  private native void Delete_cSetRescuePolyLineNodeUVT(long ndx);
  private native void AddTo2(long refNdx
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
