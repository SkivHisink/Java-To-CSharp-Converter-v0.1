package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    cSetRescueGeometryUnit.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class cSetRescueGeometryUnit extends RjniBaseClass
{


  protected cSetRescueGeometryUnit(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cSetRescueGeometryUnit()
  {
    nativeNdx = Create_cSetRescueGeometryUnit0();
  }

  public void dispose()
  {
    Delete_cSetRescueGeometryUnit(nativeNdx);
  }

  public void AddTo(RescueGeometryUnit newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public boolean RemoveFrom(RescueGeometryUnit existingObject)
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

  public RescueGeometryUnit NthObject(long ordinal)
  {
    long returnNdx = NthObject5(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeometryUnit myReturn = new RescueGeometryUnit(returnNdx);
      return myReturn;
    }
  }

  public RescueGeometryUnit NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
  }

  public RescueGeometryUnit ObjectIdentifiedBy(long identifier)
  {
    long returnNdx = ObjectIdentifiedBy6(nativeNdx
                                         ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeometryUnit myReturn = new RescueGeometryUnit(returnNdx);
      return myReturn;
    }
  }

  public RescueGeometryUnit ObjectIdentifiedBy(int identifier)
  {
    return ObjectIdentifiedBy((long) identifier);
  }

  public long Count64()
  {
    long myReturn = Count7(nativeNdx);
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
    EmptySelf8(nativeNdx);
  }

  public void Relink(RescueObject parent)
  {
    Relink11(nativeNdx
           ,(parent == null) ? 0 : parent.nativeNdx);
  }

  private native long Create_cSetRescueGeometryUnit0();
  private native void Delete_cSetRescueGeometryUnit(long ndx);
  private native void AddTo2(long refNdx
                                 ,long newObject);
  private native boolean RemoveFrom3(long refNdx
                                    ,long existingObject);
  private native boolean RemoveFrom4(long refNdx
                                    ,long ndx);
  private native long NthObject5(long refNdx
                                 ,long ordinal);
  private native long ObjectIdentifiedBy6(long refNdx
                                          ,long identifier);
  private native long Count7(long refNdx);
  private native void EmptySelf8(long refNdx);
  private native void Relink11(long refNdx
                              ,long parent);
}
