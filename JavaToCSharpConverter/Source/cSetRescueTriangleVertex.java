package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    cSetRescueTriangleVertex.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class cSetRescueTriangleVertex extends RjniBaseClass
{


  protected cSetRescueTriangleVertex(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cSetRescueTriangleVertex()
  {
    nativeNdx = Create_cSetRescueTriangleVertex0();
  }

  public void dispose()
  {
    Delete_cSetRescueTriangleVertex(nativeNdx);
  }

  public void AddTo(RescueTriangleVertex newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public boolean RemoveFrom(RescueTriangleVertex existingObject)
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

  public RescueTriangleVertex NthObject(long ordinal)
  {
    long returnNdx = NthObject5(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTriangleVertex myReturn = new RescueTriangleVertex(returnNdx);
      return myReturn;
    }
  }

  public RescueTriangleVertex NthObject(int ordinal)
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

  public int Count(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(Count64(), throwIfTooBig);
  }

  public void EmptySelf()
  {
    EmptySelf7(nativeNdx);
  }

  public void Relink(RescueObject parent)
  {
    Relink10(nativeNdx
           ,(parent == null) ? 0 : parent.nativeNdx);
  }

  public long IndexOf(RescueTriangleVertex existingObject)
  {
    long myReturn = IndexOf11(nativeNdx
                           ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  private native long Create_cSetRescueTriangleVertex0();
  private native void Delete_cSetRescueTriangleVertex(long ndx);
  private native void AddTo2(long refNdx
                                 ,long newObject);
  private native boolean RemoveFrom3(long refNdx
                                    ,long existingObject);
  private native boolean RemoveFrom4(long refNdx
                                    ,long ndx);
  private native long NthObject5(long refNdx
                                 ,long ordinal);
  private native long Count6(long refNdx);
  private native void EmptySelf7(long refNdx);
  private native void Relink10(long refNdx
                              ,long parent);
  private native long IndexOf11(long refNdx
                              ,long existingObject);
}
