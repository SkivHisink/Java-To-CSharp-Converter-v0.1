package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueCoordinateSystem.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueCoordinateSystem extends RescueHistoryObject
{

  public static final int LUF = 0;
  public static final int LUB = 1;
  public static final int LDF = 2;
  public static final int LDB = 3;
  public static final int RUF = 4;
  public static final int RUB = 5;
  public static final int RDF = 6;
  public static final int RDB = 7;

  protected RescueCoordinateSystem(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueCoordinateSystem(RescueContext context,
                                java.lang.String name,
                                int displayOrientationIn,
                                RescueVertex vertexIn,
                                java.lang.String Xproperty,
                                java.lang.String Xuom,
                                java.lang.String Yproperty,
                                java.lang.String Yuom,
                                java.lang.String Zproperty,
                                java.lang.String Zuom,
                                int insysIn,
                                int inzoneIn,
                                int inUnitIn,
                                int insphIn,
                                double semiMajorAxisIn,
                                double eccentricityIn,
                                double standardLatIn,
                                double secondLatIn,
                                double centralLongIn,
                                double latOriginIn,
                                double FALSEEastingIn,
                                double FALSENorthingIn)
  {
    nativeNdx = Create_RescueCoordinateSystem0((context == null) ? 0 : context.nativeNdx,
                                               name,
                                               displayOrientationIn,
                                               (vertexIn == null) ? 0 : vertexIn.nativeNdx,
                                               Xproperty,
                                               Xuom,
                                               Yproperty,
                                               Yuom,
                                               Zproperty,
                                               Zuom,
                                               insysIn,
                                               inzoneIn,
                                               inUnitIn,
                                               insphIn,
                                               semiMajorAxisIn,
                                               eccentricityIn,
                                               standardLatIn,
                                               secondLatIn,
                                               centralLongIn,
                                               latOriginIn,
                                               FALSEEastingIn,
                                               FALSENorthingIn);
  }

  public int PublicEPSG()
  {
    int myReturn = PublicEPSG1(nativeNdx);
	return myReturn;
  }

  public void SetPublicEPSG(int epsgIn)
  {
    SetPublicEPSG2(nativeNdx, epsgIn);
  }

  public int Dimensions()
  {
    int myReturn = Dimensions1(nativeNdx);
    return myReturn;
  }

  public RescueCoordinateSystemAxis Axis(int zeroBasedOrdinal)
  {
    long returnNdx = Axis2(nativeNdx
                           ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueCoordinateSystemAxis myReturn = new RescueCoordinateSystemAxis(returnNdx);
      return myReturn;
    }
  }

  public RescueCoordinateSystemAxis AxisIdentifiedBy(long identifier)
  {
    long returnNdx = AxisIdentifiedBy3(nativeNdx
                                       ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueCoordinateSystemAxis myReturn = new RescueCoordinateSystemAxis(returnNdx);
      return myReturn;
    }
  }

  public RescueVertex Vertex()
  {
    long returnNdx = Vertex4(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueVertex myReturn = new RescueVertex(returnNdx);
      return myReturn;
    }
  }

  public void SetVertex(RescueVertex newVertex)
  {
    SetVertex5(nativeNdx
              ,(newVertex == null) ? 0 : newVertex.nativeNdx);
  }

  public java.lang.String Name()
  {
    java.lang.String myReturn = Name6(nativeNdx);
    return myReturn;
  }

  public int OrientationIs()
  {
    int myReturn = OrientationIs7(nativeNdx);
    return myReturn;
  }

  public int InSys()
  {
    int myReturn = InSys8(nativeNdx);
    return myReturn;
  }

  public int InZone()
  {
    int myReturn = InZone9(nativeNdx);
    return myReturn;
  }

  public int InUnit()
  {
    int myReturn = InUnit10(nativeNdx);
    return myReturn;
  }

  public int InSpheroid()
  {
    int myReturn = InSpheroid11(nativeNdx);
    return myReturn;
  }

  public double SemiMajorAxis()
  {
    double myReturn = SemiMajorAxis12(nativeNdx);
    return myReturn;
  }

  public double EccentricityOrSemiMinorAxis()
  {
    double myReturn = EccentricityOrSemiMinorAxis13(nativeNdx);
    return myReturn;
  }

  public double StandardLat()
  {
    double myReturn = StandardLat14(nativeNdx);
    return myReturn;
  }

  public double SecondLat()
  {
    double myReturn = SecondLat15(nativeNdx);
    return myReturn;
  }

  public double CentralLong()
  {
    double myReturn = CentralLong16(nativeNdx);
    return myReturn;
  }

  public double LatOrigin()
  {
    double myReturn = LatOrigin17(nativeNdx);
    return myReturn;
  }

  public double FalseEasting()
  {
    double myReturn = FalseEasting18(nativeNdx);
    return myReturn;
  }

  public double FalseNorthing()
  {
    double myReturn = FalseNorthing19(nativeNdx);
    return myReturn;
  }

  public int NdxOf(RescueCoordinateSystemAxis axisIn)
  {
    int myReturn = NdxOf20(nativeNdx
                         ,(axisIn == null) ? 0 : axisIn.nativeNdx);
    return myReturn;
  }

  public RescueContext Context()
  {
    long returnNdx = Context21(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueContext myReturn = new RescueContext(returnNdx);
      return myReturn;
    }
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType22(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public void dispose()
  {
    Delete_RescueCoordinateSystem(nativeNdx);
  }

  private native long Create_RescueCoordinateSystem0(long context,
                                                    java.lang.String name,
                                                    int displayOrientationIn,
                                                    long vertexIn,
                                                    java.lang.String Xproperty,
                                                    java.lang.String Xuom,
                                                    java.lang.String Yproperty,
                                                    java.lang.String Yuom,
                                                    java.lang.String Zproperty,
                                                    java.lang.String Zuom,
                                                    int insysIn,
                                                    int inzoneIn,
                                                    int inUnitIn,
                                                    int insphIn,
                                                    double semiMajorAxisIn,
                                                    double eccentricityIn,
                                                    double standardLatIn,
                                                    double secondLatIn,
                                                    double centralLongIn,
                                                    double latOriginIn,
                                                    double FALSEEastingIn,
                                                    double FALSENorthingIn);
  private native int Dimensions1(long refNdx);
  private native long Axis2(long refNdx
                            ,int zeroBasedOrdinal);
  private native long AxisIdentifiedBy3(long refNdx
                                        ,long identifier);
  private native long Vertex4(long refNdx);
  private native void SetVertex5(long refNdx
                                ,long newVertex);
  private native java.lang.String Name6(long refNdx);
  private native int OrientationIs7(long refNdx);
  private native int InSys8(long refNdx);
  private native int InZone9(long refNdx);
  private native int InUnit10(long refNdx);
  private native int InSpheroid11(long refNdx);
  private native double SemiMajorAxis12(long refNdx);
  private native double EccentricityOrSemiMinorAxis13(long refNdx);
  private native double StandardLat14(long refNdx);
  private native double SecondLat15(long refNdx);
  private native double CentralLong16(long refNdx);
  private native double LatOrigin17(long refNdx);
  private native double FalseEasting18(long refNdx);
  private native double FalseNorthing19(long refNdx);
  private native int NdxOf20(long refNdx
                            ,long axisIn);
  private native long Context21(long refNdx);
  private native boolean IsOfType22(long refNdx
                                   ,int thisType);
  private native void Delete_RescueCoordinateSystem(long ndx);
  private native int PublicEPSG1(long refNdx);
  private native void SetPublicEPSG2(long refNdx, int epsgIn);
}
