package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueGeobody.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueGeobody extends RescueWireframeOwner
{


  protected RescueGeobody(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueGeobody(java.lang.String newBodyName,
                       RescueModel newParentModel)
  {
    nativeNdx = Create_RescueGeobody0(newBodyName,
                                      (newParentModel == null) ? 0 : newParentModel.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueGeobody(nativeNdx);
  }

  public java.lang.String BodyName()
  {
    java.lang.String myReturn = BodyName2(nativeNdx);
    return myReturn;
  }

  public void SetBodyName(java.lang.String newBodyName)
  {
    SetBodyName3(nativeNdx
                ,newBodyName);
  }

  public RescueModel ParentModel()
  {
    long returnNdx = ParentModel4(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueModel myReturn = new RescueModel(returnNdx);
      return myReturn;
    }
  }

  public long PropertyGroupCount64()
  {
    long myReturn = PropertyGroupCount5(nativeNdx);
    return myReturn;
  }

  public int PropertyGroupCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(PropertyGroupCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int PropertyGroupCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(PropertyGroupCount64(), throwIfTooBig);
  }

  public RescuePropertyGroup NthRescuePropertyGroup(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescuePropertyGroup6(nativeNdx
                                             ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePropertyGroup myReturn = new RescuePropertyGroup(returnNdx);
      return myReturn;
    }
  }

  public RescuePropertyGroup NthRescuePropertyGroup(int zeroBasedOrdinal)
  {
    long returnNdx = NthRescuePropertyGroup6(nativeNdx
                                             ,(long) zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePropertyGroup myReturn = new RescuePropertyGroup(returnNdx);
      return myReturn;
    }
  }

  public RescuePropertyGroup PropertyGroupIdentifiedBy(long identifier)
  {
    long returnNdx = PropertyGroupIdentifiedBy7(nativeNdx
                                                ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePropertyGroup myReturn = new RescuePropertyGroup(returnNdx);
      return myReturn;
    }
  }

  public RescuePropertyGroup PropertyGroupIdentifiedBy(int identifier)
  {
    long returnNdx = PropertyGroupIdentifiedBy7(nativeNdx
                                                ,(long) identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePropertyGroup myReturn = new RescuePropertyGroup(returnNdx);
      return myReturn;
    }
  }

  public boolean DropRescuePropertyGroup(RescuePropertyGroup unitToDrop)
  {
    boolean myReturn = DropRescuePropertyGroup8(nativeNdx
                                                  ,(unitToDrop == null) ? 0 : unitToDrop.nativeNdx);
    return myReturn;
  }

  public boolean DeleteBodyPart(RescueGeobodyPart existingBodyPart)
  {
    boolean myReturn = DeleteBodyPart9(nativeNdx
                                         ,(existingBodyPart == null) ? 0 : existingBodyPart.nativeNdx);
    return myReturn;
  }

  public int GeobodyPartCount()
  {
    int myReturn = GeobodyPartCount10(nativeNdx);
    return myReturn;
  }

  public RescueGeobodyPart NthBodyPart(int zeroBasedOrdinal)
  {
    long returnNdx = NthBodyPart11(nativeNdx
                                  ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeobodyPart myReturn = new RescueGeobodyPart(returnNdx);
      return myReturn;
    }
  }

  public boolean IsNamed(java.lang.String possibleName)
  {
    boolean myReturn = IsNamed12(nativeNdx
                                  ,possibleName);
    return myReturn;
  }

  public RescueGeometry GeometryIdentifiedBy(long identifier)
  {
    long returnNdx = GeometryIdentifiedBy13(nativeNdx
                                           ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeometry myReturn = new RescueGeometry(returnNdx);
      return myReturn;
    }
  }

  public RescueGeometry GeometryIdentifiedBy(int identifier)
  {
    long returnNdx = GeometryIdentifiedBy13(nativeNdx
                                           ,(long) identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeometry myReturn = new RescueGeometry(returnNdx);
      return myReturn;
    }
  }

  public RescueProperty PropertyIdentifiedBy(long identifier)
  {
    long returnNdx = PropertyIdentifiedBy14(nativeNdx
                                           ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueProperty myReturn = new RescueProperty(returnNdx);
      return myReturn;
    }
  }

  public RescueProperty PropertyIdentifiedBy(int identifier)
  {
    long returnNdx = PropertyIdentifiedBy14(nativeNdx
                                           ,(long) identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueProperty myReturn = new RescueProperty(returnNdx);
      return myReturn;
    }
  }

  public RescueGeobodyVolume GeobodyVolumeIdentifiedBy(long identifier)
  {
    long returnNdx = GeobodyVolumeIdentifiedBy15(nativeNdx
                                                ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeobodyVolume myReturn = new RescueGeobodyVolume(returnNdx);
      return myReturn;
    }
  }

  public RescueGeobodyVolume GeobodyVolumeIdentifiedBy(int identifier)
  {
    long returnNdx = GeobodyVolumeIdentifiedBy15(nativeNdx
                                                ,(int) identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeobodyVolume myReturn = new RescueGeobodyVolume(returnNdx);
      return myReturn;
    }
  }

  public RescueGeobodySurface GeobodySurfaceIdentifiedBy(long identifier)
  {
    long returnNdx = GeobodySurfaceIdentifiedBy16(nativeNdx
                                                 ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeobodySurface myReturn = new RescueGeobodySurface(returnNdx);
      return myReturn;
    }
  }

  public RescueGeobodySurface GeobodySurfaceIdentifiedBy(int identifier)
  {
    long returnNdx = GeobodySurfaceIdentifiedBy16(nativeNdx
                                                 ,(long) identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeobodySurface myReturn = new RescueGeobodySurface(returnNdx);
      return myReturn;
    }
  }

  public boolean AnyFileTruncated()
  {
    boolean myReturn = AnyFileTruncated17(nativeNdx);
    return myReturn;
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType18(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native long Create_RescueGeobody0(java.lang.String newBodyName,
                                           long newParentModel);
  private native void Delete_RescueGeobody(long ndx);
  private native java.lang.String BodyName2(long refNdx);
  private native void SetBodyName3(long refNdx
                                  ,java.lang.String newBodyName);
  private native long ParentModel4(long refNdx);
  private native long PropertyGroupCount5(long refNdx);
  private native long NthRescuePropertyGroup6(long refNdx
                                              ,long zeroBasedOrdinal);
  private native long PropertyGroupIdentifiedBy7(long refNdx
                                                 ,long identifier);
  private native boolean DropRescuePropertyGroup8(long refNdx
                                                 ,long unitToDrop);
  private native boolean DeleteBodyPart9(long refNdx
                                        ,long existingBodyPart);
  private native int GeobodyPartCount10(long refNdx);
  private native long NthBodyPart11(long refNdx
                                    ,int zeroBasedOrdinal);
  private native boolean IsNamed12(long refNdx
                                  ,java.lang.String possibleName);
  private native long GeometryIdentifiedBy13(long refNdx
                                             ,long identifier);
  private native long PropertyIdentifiedBy14(long refNdx
                                             ,long identifier);
  private native long GeobodyVolumeIdentifiedBy15(long refNdx
                                                  ,long identifier);
  private native long GeobodySurfaceIdentifiedBy16(long refNdx
                                                   ,long identifier);
  private native boolean AnyFileTruncated17(long refNdx);
  private native boolean IsOfType18(long refNdx
                                   ,int thisType);
}
