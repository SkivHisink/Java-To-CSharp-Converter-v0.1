using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueWellboreProperty : RescueHistoryObject
{


  protected RescueWellboreProperty(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueWellboreProperty(RescueWellboreSampling parentSampling,
                                string propertyName,
                                string propertyType,
                                string unitOfMeasure,
                                float nullValue,
                                float[] values)
  {
    nativeNdx = Create_RescueWellboreProperty0((parentSampling == null) ? 0 : parentSampling.nativeNdx,
                                               propertyName,
                                               propertyType,
                                               unitOfMeasure,
                                               nullValue,
                                               values);
  }

  public RescueWellboreProperty(RescueWellboreSampling parentSampling,
                                string propertyName,
                                string propertyType,
                                string unitOfMeasure,
                                int nullValue,
                                int[] values)
  {
    nativeNdx = Create_RescueWellboreProperty1((parentSampling == null) ? 0 : parentSampling.nativeNdx,
                                               propertyName,
                                               propertyType,
                                               unitOfMeasure,
                                               nullValue,
                                               values);
  }

  public RescueWellboreProperty(RescueWellboreSampling parentSampling,
                                string propertyName,
                                string propertyType,
                                string unitOfMeasure,
                                byte nullValue,
                                RescueLookup lookupIn,
                                byte[] values)
  {
    nativeNdx = Create_RescueWellboreProperty2((parentSampling == null) ? 0 : parentSampling.nativeNdx,
                                               propertyName,
                                               propertyType,
                                               unitOfMeasure,
                                               nullValue,
                                               (lookupIn == null) ? 0 : lookupIn.nativeNdx,
                                               values);
  }

  public RescueWellboreProperty(RescueWellboreSampling parentSampling,
                                string propertyName,
                                string propertyType,
                                string unitOfMeasure,
                                char nullValue,
                                RescueLookup lookupIn,
                                char[] values)
  {
    nativeNdx = Create_RescueWellboreProperty3((parentSampling == null) ? 0 : parentSampling.nativeNdx,
                                               propertyName,
                                               propertyType,
                                               unitOfMeasure,
                                               nullValue,
                                               (lookupIn == null) ? 0 : lookupIn.nativeNdx,
                                               values);
  }

  public void dispose()
  {
    Delete_RescueWellboreProperty(nativeNdx);
  }

  public RescueWellbore ParentWellbore()
  {
    long returnNdx = ParentWellbore5(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWellbore myReturn = new RescueWellbore(returnNdx);
      return myReturn;
    }
  }

  public RescueWellboreSampling ParentWellboreSampling()
  {
    long returnNdx = ParentWellboreSampling6(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWellboreSampling myReturn = new RescueWellboreSampling(returnNdx);
      return myReturn;
    }
  }

  public RescueArray Data()
  {
    long returnNdx = Data7(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueArray myReturn = new RescueArray(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueArray2dVector:
        myReturn = new RescueArray2dVector(returnNdx);
        break;
      case RescueObject.R_RescueArray3dVector:
        myReturn = new RescueArray3dVector(returnNdx);
        break;
      case RescueObject.R_RescueArrayByte:
        myReturn = new RescueArrayByte(returnNdx);
        break;
      case RescueObject.R_RescueArrayDouble:
        myReturn = new RescueArrayDouble(returnNdx);
        break;
      case RescueObject.R_RescueArrayFloat:
        myReturn = new RescueArrayFloat(returnNdx);
        break;
      case RescueObject.R_RescueArrayInt:
        myReturn = new RescueArrayInt(returnNdx);
        break;
      case RescueObject.R_RescueArrayShort:
        myReturn = new RescueArrayShort(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public bool AnyFileTruncated()
  {
    bool myReturn = AnyFileTruncated8(nativeNdx);
    return myReturn;
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType9(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}