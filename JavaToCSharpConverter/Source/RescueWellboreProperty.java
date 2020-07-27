package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueWellboreProperty.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueWellboreProperty extends RescueHistoryObject
{


  protected RescueWellboreProperty(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueWellboreProperty(RescueWellboreSampling parentSampling,
                                java.lang.String propertyName,
                                java.lang.String propertyType,
                                java.lang.String unitOfMeasure,
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
                                java.lang.String propertyName,
                                java.lang.String propertyType,
                                java.lang.String unitOfMeasure,
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
                                java.lang.String propertyName,
                                java.lang.String propertyType,
                                java.lang.String unitOfMeasure,
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
                                java.lang.String propertyName,
                                java.lang.String propertyType,
                                java.lang.String unitOfMeasure,
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

  public boolean AnyFileTruncated()
  {
    boolean myReturn = AnyFileTruncated8(nativeNdx);
    return myReturn;
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType9(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native long Create_RescueWellboreProperty0(long parentSampling,
                                                    java.lang.String propertyName,
                                                    java.lang.String propertyType,
                                                    java.lang.String unitOfMeasure,
                                                    float nullValue,
                                                    float[] values);
  private native long Create_RescueWellboreProperty1(long parentSampling,
                                                    java.lang.String propertyName,
                                                    java.lang.String propertyType,
                                                    java.lang.String unitOfMeasure,
                                                    int nullValue,
                                                    int[] values);
  private native long Create_RescueWellboreProperty2(long parentSampling,
                                                    java.lang.String propertyName,
                                                    java.lang.String propertyType,
                                                    java.lang.String unitOfMeasure,
                                                    byte nullValue,
                                                    long lookupIn,
                                                    byte[] values);
  private native long Create_RescueWellboreProperty3(long parentSampling,
                                                    java.lang.String propertyName,
                                                    java.lang.String propertyType,
                                                    java.lang.String unitOfMeasure,
                                                    char nullValue,
                                                    long lookupIn,
                                                    char[] values);
  private native void Delete_RescueWellboreProperty(long ndx);
  private native long ParentWellbore5(long refNdx);
  private native long ParentWellboreSampling6(long refNdx);
  private native long Data7(long refNdx);
  private native boolean AnyFileTruncated8(long refNdx);
  private native boolean IsOfType9(long refNdx
                                  ,int thisType);
}
