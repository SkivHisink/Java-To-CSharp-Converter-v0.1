package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueProperty.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueProperty extends RescueHistoryObject
{

  public static final int FRONT = 0;
  public static final int BACK = 1;
  public static final int BOTH = 2;
  public static final int NA = 3;
  public static final int CELL_CENTERED = 0;
  public static final int FACE_CENTERED = 1;
  public static final int NODE_CENTERED = 2;
  public static final int I1_FACE = 3;
  public static final int I2_FACE = 4;
  public static final int J1_FACE = 5;
  public static final int J2_FACE = 6;
  public static final int K1_FACE = 7;
  public static final int K2_FACE = 8;

  protected RescueProperty(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueProperty(RescueTriangulatedSurface parentSurface,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        int applies,
                        float nullValue,
                        float[] valueArray,
                        int attachedToIn)
  {
    nativeNdx = Create_RescueProperty0((parentSurface == null) ? 0 : parentSurface.nativeNdx,
                                       propertyNameIn,
                                       propertyTypeIn,
                                       unitOfMeasureIn,
                                       applies,
                                       nullValue,
                                       valueArray,
                                       attachedToIn);
  }

  public RescueProperty(RescueTriangulatedSurface parentSurface,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        int applies,
                        int nullValue,
                        int[] valueArray,
                        int attachedToIn)
  {
    nativeNdx = Create_RescueProperty1((parentSurface == null) ? 0 : parentSurface.nativeNdx,
                                       propertyNameIn,
                                       propertyTypeIn,
                                       unitOfMeasureIn,
                                       applies,
                                       nullValue,
                                       valueArray,
                                       attachedToIn);
  }

  public RescueProperty(RescueTriangulatedSurface parentSurface,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        int applies,
                        RescueLookup lookupTableIn,
                        byte nullValue,
                        byte[] valueArray,
                        int attachedToIn)
  {
    nativeNdx = Create_RescueProperty2((parentSurface == null) ? 0 : parentSurface.nativeNdx,
                                       propertyNameIn,
                                       propertyTypeIn,
                                       unitOfMeasureIn,
                                       applies,
                                       (lookupTableIn == null) ? 0 : lookupTableIn.nativeNdx,
                                       nullValue,
                                       valueArray,
                                       attachedToIn);
  }

  public RescueProperty(RescueTriangulatedSurface parentSurface,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        int applies,
                        RescueLookup lookupTableIn,
                        char nullValue,
                        char[] valueArray,
                        int attachedToIn)
  {
    nativeNdx = Create_RescueProperty3((parentSurface == null) ? 0 : parentSurface.nativeNdx,
                                       propertyNameIn,
                                       propertyTypeIn,
                                       unitOfMeasureIn,
                                       applies,
                                       (lookupTableIn == null) ? 0 : lookupTableIn.nativeNdx,
                                       nullValue,
                                       valueArray,
                                       attachedToIn);
  }

  public RescueProperty(RescueTriangulatedSurface parentSurface,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        int applies,
                        Rescue2dVector nullValue,
                        Rescue2dVector[] valueArray,
                        int attachedToIn)
  {
    nativeNdx = Create_RescueProperty4((parentSurface == null) ? 0 : parentSurface.nativeNdx,
                                       propertyNameIn,
                                       propertyTypeIn,
                                       unitOfMeasureIn,
                                       applies,
                                       nullValue,
                                       valueArray,
                                       attachedToIn);
  }

  public RescueProperty(RescueTriangulatedSurface parentSurface,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        int applies,
                        Rescue3dVector nullValue,
                        Rescue3dVector[] valueArray,
                        int attachedToIn)
  {
    nativeNdx = Create_RescueProperty5((parentSurface == null) ? 0 : parentSurface.nativeNdx,
                                       propertyNameIn,
                                       propertyTypeIn,
                                       unitOfMeasureIn,
                                       applies,
                                       nullValue,
                                       valueArray,
                                       attachedToIn);
  }

  public RescueProperty(RescueSurface parentSurface,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        int applies,
                        float nullValue,
                        float[] valueArray,
                        int attachedToIn,
                        RescueIJSurface parentIJSurface)
  {
    nativeNdx = Create_RescueProperty6((parentSurface == null) ? 0 : parentSurface.nativeNdx,
                                       propertyNameIn,
                                       propertyTypeIn,
                                       unitOfMeasureIn,
                                       applies,
                                       nullValue,
                                       valueArray,
                                       attachedToIn,
                                       (parentIJSurface == null) ? 0 : parentIJSurface.nativeNdx);
  }

  public RescueProperty(RescueSurface parentSurface,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        int applies,
                        int nullValue,
                        int[] valueArray,
                        int attachedToIn,
                        RescueIJSurface parentIJSurface)
  {
    nativeNdx = Create_RescueProperty7((parentSurface == null) ? 0 : parentSurface.nativeNdx,
                                       propertyNameIn,
                                       propertyTypeIn,
                                       unitOfMeasureIn,
                                       applies,
                                       nullValue,
                                       valueArray,
                                       attachedToIn,
                                       (parentIJSurface == null) ? 0 : parentIJSurface.nativeNdx);
  }

  public RescueProperty(RescueSurface parentSurface,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        int applies,
                        RescueLookup lookupTableIn,
                        byte nullValue,
                        byte[] valueArray,
                        int attachedToIn,
                        RescueIJSurface parentIJSurface)
  {
    nativeNdx = Create_RescueProperty8((parentSurface == null) ? 0 : parentSurface.nativeNdx,
                                       propertyNameIn,
                                       propertyTypeIn,
                                       unitOfMeasureIn,
                                       applies,
                                       (lookupTableIn == null) ? 0 : lookupTableIn.nativeNdx,
                                       nullValue,
                                       valueArray,
                                       attachedToIn,
                                       (parentIJSurface == null) ? 0 : parentIJSurface.nativeNdx);
  }

  public RescueProperty(RescueSurface parentSurface,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        int applies,
                        RescueLookup lookupTableIn,
                        char nullValue,
                        char[] valueArray,
                        int attachedToIn,
                        RescueIJSurface parentIJSurface)
  {
    nativeNdx = Create_RescueProperty9((parentSurface == null) ? 0 : parentSurface.nativeNdx,
                                       propertyNameIn,
                                       propertyTypeIn,
                                       unitOfMeasureIn,
                                       applies,
                                       (lookupTableIn == null) ? 0 : lookupTableIn.nativeNdx,
                                       nullValue,
                                       valueArray,
                                       attachedToIn,
                                       (parentIJSurface == null) ? 0 : parentIJSurface.nativeNdx);
  }

  public RescueProperty(RescueSurface parentSurface,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        int applies,
                        Rescue2dVector nullValue,
                        Rescue2dVector[] valueArray,
                        int attachedToIn,
                        RescueIJSurface parentIJSurface)
  {
    nativeNdx = Create_RescueProperty10((parentSurface == null) ? 0 : parentSurface.nativeNdx,
                                        propertyNameIn,
                                        propertyTypeIn,
                                        unitOfMeasureIn,
                                        applies,
                                        nullValue,
                                        valueArray,
                                        attachedToIn,
                                        (parentIJSurface == null) ? 0 : parentIJSurface.nativeNdx);
  }

  public RescueProperty(RescueSurface parentSurface,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        int applies,
                        Rescue3dVector nullValue,
                        Rescue3dVector[] valueArray,
                        int attachedToIn,
                        RescueIJSurface parentIJSurface)
  {
    nativeNdx = Create_RescueProperty11((parentSurface == null) ? 0 : parentSurface.nativeNdx,
                                        propertyNameIn,
                                        propertyTypeIn,
                                        unitOfMeasureIn,
                                        applies,
                                        nullValue,
                                        valueArray,
                                        attachedToIn,
                                        (parentIJSurface == null) ? 0 : parentIJSurface.nativeNdx);
  }

  public RescueProperty(RescueGeometry geometryIn,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        float nullValue,
                        float[] valueArray,
                        int attachedToIn)
  {
    nativeNdx = Create_RescueProperty12((geometryIn == null) ? 0 : geometryIn.nativeNdx,
                                        propertyNameIn,
                                        propertyTypeIn,
                                        unitOfMeasureIn,
                                        nullValue,
                                        valueArray,
                                        attachedToIn);
  }

  public RescueProperty(RescueGeometry geometryIn,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        int nullValue,
                        int[] valueArray,
                        int attachedToIn)
  {
    nativeNdx = Create_RescueProperty13((geometryIn == null) ? 0 : geometryIn.nativeNdx,
                                        propertyNameIn,
                                        propertyTypeIn,
                                        unitOfMeasureIn,
                                        nullValue,
                                        valueArray,
                                        attachedToIn);
  }

  public RescueProperty(RescueGeometry geometryIn,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        RescueLookup lookupTableIn,
                        byte nullValue,
                        byte[] valueArray,
                        int attachedToIn)
  {
    nativeNdx = Create_RescueProperty14((geometryIn == null) ? 0 : geometryIn.nativeNdx,
                                        propertyNameIn,
                                        propertyTypeIn,
                                        unitOfMeasureIn,
                                        (lookupTableIn == null) ? 0 : lookupTableIn.nativeNdx,
                                        nullValue,
                                        valueArray,
                                        attachedToIn);
  }

  public RescueProperty(RescueGeometry geometryIn,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        RescueLookup lookupTableIn,
                        char nullValue,
                        char[] valueArray,
                        int attachedToIn)
  {
    nativeNdx = Create_RescueProperty15((geometryIn == null) ? 0 : geometryIn.nativeNdx,
                                        propertyNameIn,
                                        propertyTypeIn,
                                        unitOfMeasureIn,
                                        (lookupTableIn == null) ? 0 : lookupTableIn.nativeNdx,
                                        nullValue,
                                        valueArray,
                                        attachedToIn);
  }

  public RescueProperty(RescueGeometry geometryIn,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        Rescue2dVector nullValue,
                        Rescue2dVector[] valueArray,
                        int attachedToIn)
  {
    nativeNdx = Create_RescueProperty16((geometryIn == null) ? 0 : geometryIn.nativeNdx,
                                        propertyNameIn,
                                        propertyTypeIn,
                                        unitOfMeasureIn,
                                        nullValue,
                                        valueArray,
                                        attachedToIn);
  }

  public RescueProperty(RescueGeometry geometryIn,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        Rescue3dVector nullValue,
                        Rescue3dVector[] valueArray,
                        int attachedToIn)
  {
    nativeNdx = Create_RescueProperty17((geometryIn == null) ? 0 : geometryIn.nativeNdx,
                                        propertyNameIn,
                                        propertyTypeIn,
                                        unitOfMeasureIn,
                                        nullValue,
                                        valueArray,
                                        attachedToIn);
  }

  public RescueProperty(RescueDataContainer containerIn,
                        RescueModel modelIn,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        int applies,
                        float nullValue,
                        float[] valueArray,
                        int attachedToIn)
  {
    nativeNdx = Create_RescueProperty18((containerIn == null) ? 0 : containerIn.nativeNdx,
                                        (modelIn == null) ? 0 : modelIn.nativeNdx,
                                        propertyNameIn,
                                        propertyTypeIn,
                                        unitOfMeasureIn,
                                        applies,
                                        nullValue,
                                        valueArray,
                                        attachedToIn);
  }

  public RescueProperty(RescueDataContainer containerIn,
                        RescueModel modelIn,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        int applies,
                        int nullValue,
                        int[] valueArray,
                        int attachedToIn)
  {
    nativeNdx = Create_RescueProperty19((containerIn == null) ? 0 : containerIn.nativeNdx,
                                        (modelIn == null) ? 0 : modelIn.nativeNdx,
                                        propertyNameIn,
                                        propertyTypeIn,
                                        unitOfMeasureIn,
                                        applies,
                                        nullValue,
                                        valueArray,
                                        attachedToIn);
  }

  public RescueProperty(RescueDataContainer containerIn,
                        RescueModel modelIn,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        int applies,
                        RescueLookup lookupTableIn,
                        byte nullValue,
                        byte[] valueArray,
                        int attachedToIn)
  {
    nativeNdx = Create_RescueProperty20((containerIn == null) ? 0 : containerIn.nativeNdx,
                                        (modelIn == null) ? 0 : modelIn.nativeNdx,
                                        propertyNameIn,
                                        propertyTypeIn,
                                        unitOfMeasureIn,
                                        applies,
                                        (lookupTableIn == null) ? 0 : lookupTableIn.nativeNdx,
                                        nullValue,
                                        valueArray,
                                        attachedToIn);
  }

  public RescueProperty(RescueDataContainer containerIn,
                        RescueModel modelIn,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        int applies,
                        RescueLookup lookupTableIn,
                        char nullValue,
                        char[] valueArray,
                        int attachedToIn)
  {
    nativeNdx = Create_RescueProperty21((containerIn == null) ? 0 : containerIn.nativeNdx,
                                        (modelIn == null) ? 0 : modelIn.nativeNdx,
                                        propertyNameIn,
                                        propertyTypeIn,
                                        unitOfMeasureIn,
                                        applies,
                                        (lookupTableIn == null) ? 0 : lookupTableIn.nativeNdx,
                                        nullValue,
                                        valueArray,
                                        attachedToIn);
  }

  public RescueProperty(RescueDataContainer containerIn,
                        RescueModel modelIn,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        int applies,
                        Rescue2dVector nullValue,
                        Rescue2dVector[] valueArray,
                        int attachedToIn)
  {
    nativeNdx = Create_RescueProperty22((containerIn == null) ? 0 : containerIn.nativeNdx,
                                        (modelIn == null) ? 0 : modelIn.nativeNdx,
                                        propertyNameIn,
                                        propertyTypeIn,
                                        unitOfMeasureIn,
                                        applies,
                                        nullValue,
                                        valueArray,
                                        attachedToIn);
  }

  public RescueProperty(RescueDataContainer containerIn,
                        RescueModel modelIn,
                        java.lang.String propertyNameIn,
                        java.lang.String propertyTypeIn,
                        java.lang.String unitOfMeasureIn,
                        int applies,
                        Rescue3dVector nullValue,
                        Rescue3dVector[] valueArray,
                        int attachedToIn)
  {
    nativeNdx = Create_RescueProperty23((containerIn == null) ? 0 : containerIn.nativeNdx,
                                        (modelIn == null) ? 0 : modelIn.nativeNdx,
                                        propertyNameIn,
                                        propertyTypeIn,
                                        unitOfMeasureIn,
                                        applies,
                                        nullValue,
                                        valueArray,
                                        attachedToIn);
  }

  public void dispose()
  {
    Delete_RescueProperty(nativeNdx);
  }

  public RescueBlockUnit ParentBlockUnit()
  {
    long returnNdx = ParentBlockUnit19(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueBlockUnit myReturn = new RescueBlockUnit(returnNdx);
      return myReturn;
    }
  }

  public RescueGeobodyPart ParentGeobodyPart()
  {
    long returnNdx = ParentGeobodyPart20(nativeNdx);
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

  public RescueSurface ParentSurface()
  {
    long returnNdx = ParentSurface21(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueSurface myReturn = new RescueSurface(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueReferenceSurface:
        myReturn = new RescueReferenceSurface(returnNdx);
        break;
      case RescueObject.R_RescueSection:
        myReturn = new RescueSection(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public RescueIJSurface ParentIJSurface()
  {
    long returnNdx = ParentIJSurface22(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueIJSurface myReturn = new RescueIJSurface(returnNdx);
      return myReturn;
    }
  }

  public RescueDataContainer Container()
  {
    long returnNdx = Container29(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueDataContainer myReturn = new RescueDataContainer(returnNdx);
      return myReturn;
    }
  }

  public boolean TriangulatedSurface()
  {
    boolean myReturn = TriangulatedSurface23(nativeNdx);
    return myReturn;
  }

  public long TrimLoopCount64()
  {
    long myReturn = TrimLoopCount24(nativeNdx);
    return myReturn;
  }

  public int TrimLoopCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(TrimLoopCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int TrimLoopCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(TrimLoopCount64(), throwIfTooBig);
  }

  public RescueTrimLoopStub NthTrimLoop(long zeroBasedOrdinal)
  {
    long returnNdx = NthTrimLoop25(nativeNdx
                                  ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTrimLoopStub myReturn = new RescueTrimLoopStub(returnNdx);
      return myReturn;
    }
  }

  public int HowApplies()
  {
    int myReturn = HowApplies26(nativeNdx);
    return myReturn;
  }

  public int PropertyAttachedTo()
  {
    int myReturn = PropertyAttachedTo27(nativeNdx);
    return myReturn;
  }

  public void AddTrimLoop(RescueTrimLoop existingLoop)
  {
    AddTrimLoop28(nativeNdx
                ,(existingLoop == null) ? 0 : existingLoop.nativeNdx);
  }

  public void RelinkTrimLoops(RescueModel model)
  {
    RelinkTrimLoops29(nativeNdx
                    ,(model == null) ? 0 : model.nativeNdx);
  }

  public RescueArray Data()
  {
    long returnNdx = Data30(nativeNdx);
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

  public RescueGeometry Geometry()
  {
    long returnNdx = Geometry31(nativeNdx);
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

  public void SetColorTable(RescueColorTable newTable)
  {
    SetColorTable32(nativeNdx
                  ,(newTable == null) ? 0 : newTable.nativeNdx);
  }

  public RescueColorTable ColorTable()
  {
    long returnNdx = ColorTable33(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueColorTable myReturn = new RescueColorTable(returnNdx);
      return myReturn;
    }
  }

  public boolean AnyFileTruncated()
  {
    boolean myReturn = AnyFileTruncated34(nativeNdx);
    return myReturn;
  }

  public boolean IsNamed(java.lang.String mayBeName)
  {
    boolean myReturn = IsNamed35(nativeNdx
                                  ,mayBeName);
    return myReturn;
  }

  public boolean TestLock()
  {
    boolean myReturn = TestLock36(nativeNdx);
    return myReturn;
  }

  public void SetLock()
  {
    SetLock37(nativeNdx);
  }

  public void ResetLock()
  {
    ResetLock38(nativeNdx);
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType39(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native long Create_RescueProperty0(long parentSurface,
                                            java.lang.String propertyNameIn,
                                            java.lang.String propertyTypeIn,
                                            java.lang.String unitOfMeasureIn,
                                            int applies,
                                            float nullValue,
                                            float[] valueArray,
                                            int attachedToIn);
  private native long Create_RescueProperty1(long parentSurface,
                                            java.lang.String propertyNameIn,
                                            java.lang.String propertyTypeIn,
                                            java.lang.String unitOfMeasureIn,
                                            int applies,
                                            int nullValue,
                                            int[] valueArray,
                                            int attachedToIn);
  private native long Create_RescueProperty2(long parentSurface,
                                            java.lang.String propertyNameIn,
                                            java.lang.String propertyTypeIn,
                                            java.lang.String unitOfMeasureIn,
                                            int applies,
                                            long lookupTableIn,
                                            byte nullValue,
                                            byte[] valueArray,
                                            int attachedToIn);
  private native long Create_RescueProperty3(long parentSurface,
                                            java.lang.String propertyNameIn,
                                            java.lang.String propertyTypeIn,
                                            java.lang.String unitOfMeasureIn,
                                            int applies,
                                            long lookupTableIn,
                                            char nullValue,
                                            char[] valueArray,
                                            int attachedToIn);
  private native long Create_RescueProperty4(long parentSurface,
                                            java.lang.String propertyNameIn,
                                            java.lang.String propertyTypeIn,
                                            java.lang.String unitOfMeasureIn,
                                            int applies,
                                            Rescue2dVector nullValue,
                                            Rescue2dVector[] valueArray,
                                            int attachedToIn);
  private native long Create_RescueProperty5(long parentSurface,
                                            java.lang.String propertyNameIn,
                                            java.lang.String propertyTypeIn,
                                            java.lang.String unitOfMeasureIn,
                                            int applies,
                                            Rescue3dVector nullValue,
                                            Rescue3dVector[] valueArray,
                                            int attachedToIn);
  private native long Create_RescueProperty6(long parentSurface,
                                            java.lang.String propertyNameIn,
                                            java.lang.String propertyTypeIn,
                                            java.lang.String unitOfMeasureIn,
                                            int applies,
                                            float nullValue,
                                            float[] valueArray,
                                            int attachedToIn,
                                            long parentIJSurface);
  private native long Create_RescueProperty7(long parentSurface,
                                            java.lang.String propertyNameIn,
                                            java.lang.String propertyTypeIn,
                                            java.lang.String unitOfMeasureIn,
                                            int applies,
                                            int nullValue,
                                            int[] valueArray,
                                            int attachedToIn,
                                            long parentIJSurface);
  private native long Create_RescueProperty8(long parentSurface,
                                            java.lang.String propertyNameIn,
                                            java.lang.String propertyTypeIn,
                                            java.lang.String unitOfMeasureIn,
                                            int applies,
                                            long lookupTableIn,
                                            byte nullValue,
                                            byte[] valueArray,
                                            int attachedToIn,
                                            long parentIJSurface);
  private native long Create_RescueProperty9(long parentSurface,
                                            java.lang.String propertyNameIn,
                                            java.lang.String propertyTypeIn,
                                            java.lang.String unitOfMeasureIn,
                                            int applies,
                                            long lookupTableIn,
                                            char nullValue,
                                            char[] valueArray,
                                            int attachedToIn,
                                            long parentIJSurface);
  private native long Create_RescueProperty10(long parentSurface,
                                             java.lang.String propertyNameIn,
                                             java.lang.String propertyTypeIn,
                                             java.lang.String unitOfMeasureIn,
                                             int applies,
                                             Rescue2dVector nullValue,
                                             Rescue2dVector[] valueArray,
                                             int attachedToIn,
                                             long parentIJSurface);
  private native long Create_RescueProperty11(long parentSurface,
                                             java.lang.String propertyNameIn,
                                             java.lang.String propertyTypeIn,
                                             java.lang.String unitOfMeasureIn,
                                             int applies,
                                             Rescue3dVector nullValue,
                                             Rescue3dVector[] valueArray,
                                             int attachedToIn,
                                             long parentIJSurface);
  private native long Create_RescueProperty12(long geometryIn,
                                             java.lang.String propertyNameIn,
                                             java.lang.String propertyTypeIn,
                                             java.lang.String unitOfMeasureIn,
                                             float nullValue,
                                             float[] valueArray,
                                             int attachedToIn);
  private native long Create_RescueProperty13(long geometryIn,
                                             java.lang.String propertyNameIn,
                                             java.lang.String propertyTypeIn,
                                             java.lang.String unitOfMeasureIn,
                                             int nullValue,
                                             int[] valueArray,
                                             int attachedToIn);
  private native long Create_RescueProperty14(long geometryIn,
                                             java.lang.String propertyNameIn,
                                             java.lang.String propertyTypeIn,
                                             java.lang.String unitOfMeasureIn,
                                             long lookupTableIn,
                                             byte nullValue,
                                             byte[] valueArray,
                                             int attachedToIn);
  private native long Create_RescueProperty15(long geometryIn,
                                             java.lang.String propertyNameIn,
                                             java.lang.String propertyTypeIn,
                                             java.lang.String unitOfMeasureIn,
                                             long lookupTableIn,
                                             char nullValue,
                                             char[] valueArray,
                                             int attachedToIn);
  private native long Create_RescueProperty16(long geometryIn,
                                             java.lang.String propertyNameIn,
                                             java.lang.String propertyTypeIn,
                                             java.lang.String unitOfMeasureIn,
                                             Rescue2dVector nullValue,
                                             Rescue2dVector[] valueArray,
                                             int attachedToIn);
  private native long Create_RescueProperty17(long geometryIn,
                                             java.lang.String propertyNameIn,
                                             java.lang.String propertyTypeIn,
                                             java.lang.String unitOfMeasureIn,
                                             Rescue3dVector nullValue,
                                             Rescue3dVector[] valueArray,
                                             int attachedToIn);
  private native long Create_RescueProperty18(long containerIn,
                                             long modelIn,
                                             java.lang.String propertyNameIn,
                                             java.lang.String propertyTypeIn,
                                             java.lang.String unitOfMeasureIn,
                                             int applies,
                                             float nullValue,
                                             float[] valueArray,
                                             int attachedToIn);
  private native long Create_RescueProperty19(long containerIn,
                                             long modelIn,
                                             java.lang.String propertyNameIn,
                                             java.lang.String propertyTypeIn,
                                             java.lang.String unitOfMeasureIn,
                                             int applies,
                                             int nullValue,
                                             int[] valueArray,
                                             int attachedToIn);
  private native long Create_RescueProperty20(long containerIn,
                                             long modelIn,
                                             java.lang.String propertyNameIn,
                                             java.lang.String propertyTypeIn,
                                             java.lang.String unitOfMeasureIn,
                                             int applies,
                                             long lookupTableIn,
                                             byte nullValue,
                                             byte[] valueArray,
                                             int attachedToIn);
  private native long Create_RescueProperty21(long containerIn,
                                             long modelIn,
                                             java.lang.String propertyNameIn,
                                             java.lang.String propertyTypeIn,
                                             java.lang.String unitOfMeasureIn,
                                             int applies,
                                             long lookupTableIn,
                                             char nullValue,
                                             char[] valueArray,
                                             int attachedToIn);
  private native long Create_RescueProperty22(long containerIn,
                                             long modelIn,
                                             java.lang.String propertyNameIn,
                                             java.lang.String propertyTypeIn,
                                             java.lang.String unitOfMeasureIn,
                                             int applies,
                                             Rescue2dVector nullValue,
                                             Rescue2dVector[] valueArray,
                                             int attachedToIn);
  private native long Create_RescueProperty23(long containerIn,
                                             long modelIn,
                                             java.lang.String propertyNameIn,
                                             java.lang.String propertyTypeIn,
                                             java.lang.String unitOfMeasureIn,
                                             int applies,
                                             Rescue3dVector nullValue,
                                             Rescue3dVector[] valueArray,
                                             int attachedToIn);
  private native void Delete_RescueProperty(long ndx);
  private native long ParentBlockUnit19(long refNdx);
  private native long ParentGeobodyPart20(long refNdx);
  private native long ParentSurface21(long refNdx);
  private native long ParentIJSurface22(long refNdx);
  private native boolean TriangulatedSurface23(long refNdx);
  private native long TrimLoopCount24(long refNdx);
  private native long NthTrimLoop25(long refNdx
                                    ,long zeroBasedOrdinal);
  private native int HowApplies26(long refNdx);
  private native int PropertyAttachedTo27(long refNdx);
  private native void AddTrimLoop28(long refNdx
                                   ,long existingLoop);
  private native long Container29(long refNdx);
  private native void RelinkTrimLoops29(long refNdx
                                       ,long model);
  private native long Data30(long refNdx);
  private native long Geometry31(long refNdx);
  private native void SetColorTable32(long refNdx
                                     ,long newTable);
  private native long ColorTable33(long refNdx);
  private native boolean AnyFileTruncated34(long refNdx);
  private native boolean IsNamed35(long refNdx
                                  ,java.lang.String mayBeName);
  private native boolean TestLock36(long refNdx);
  private native void SetLock37(long refNdx);
  private native void ResetLock38(long refNdx);
  private native boolean IsOfType39(long refNdx
                                   ,int thisType);
}
