using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueGeobody : RescueWireframeOwner
{


  protected RescueGeobody(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueGeobody(string newBodyName,
                       RescueModel newParentModel)
  {
    nativeNdx = Create_RescueGeobody0(newBodyName,
                                      (newParentModel == null) ? 0 : newParentModel.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueGeobody(nativeNdx);
  }

  public string BodyName()
  {
    string myReturn = BodyName2(nativeNdx);
    return myReturn;
  }

  public void SetBodyName(string newBodyName)
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

  public int PropertyGroupCount(bool throwIfTooBig) //thro RuntimeException
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

  public bool DropRescuePropertyGroup(RescuePropertyGroup unitToDrop)
  {
    bool myReturn = DropRescuePropertyGroup8(nativeNdx
                                                  ,(unitToDrop == null) ? 0 : unitToDrop.nativeNdx);
    return myReturn;
  }

  public bool DeleteBodyPart(RescueGeobodyPart existingBodyPart)
  {
    bool myReturn = DeleteBodyPart9(nativeNdx
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

  public bool IsNamed(string possibleName)
  {
    bool myReturn = IsNamed12(nativeNdx
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

  public bool AnyFileTruncated()
  {
    bool myReturn = AnyFileTruncated17(nativeNdx);
    return myReturn;
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType18(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}