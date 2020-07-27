package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueSection.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueSection extends RescueSurface
{


  protected RescueSection(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueSection(nativeNdx);
  }

  public RescueSection(int orientation,
                       java.lang.String newSectionName,
                       RescueModel parentModel,
                       int typeIn,
                       long i_lowbound,
                       long i_count,
                       long j_lowbound,
                       long j_count,
                       float missingValue)
  {
    nativeNdx = Create_RescueSection1(orientation,
                                      newSectionName,
                                      (parentModel == null) ? 0 : parentModel.nativeNdx,
                                      typeIn,
                                      i_lowbound,
                                      i_count,
                                      j_lowbound,
                                      j_count,
                                      missingValue);
  }

  public RescueSection(int orientation,
                       java.lang.String newSectionName,
                       RescueModel parentModel,
                       int typeIn,
                       float missingValue)
  {
    nativeNdx = Create_RescueSection2(orientation,
                                      newSectionName,
                                      (parentModel == null) ? 0 : parentModel.nativeNdx,
                                      typeIn,
                                      missingValue);
  }

  public RescueSection(int orientation,
                       java.lang.String newSectionName,
                       RescueModel parentModel,
                       int typeIn,
                       long i_lowbound,
                       long i_count,
                       long j_lowbound,
                       long j_count,
                       float missingValue,
                       float[] tripletArray)
  {
    nativeNdx = Create_RescueSection3(orientation,
                                      newSectionName,
                                      (parentModel == null) ? 0 : parentModel.nativeNdx,
                                      typeIn,
                                      i_lowbound,
                                      i_count,
                                      j_lowbound,
                                      j_count,
                                      missingValue,
                                      tripletArray);
  }

  public RescueSection(int orientation,
                       java.lang.String newSectionName,
                       RescueModel modelIn,
                       int type,
                       RescueCoordinateSystemAxis i_axis,
                       float i_origin,
                       float i_step,
                       long i_lowbound,
                       long i_count,
                       RescueCoordinateSystemAxis j_axis,
                       float j_origin,
                       float j_step,
                       long j_lowbound,
                       long j_count,
                       float missingValue)
  {
    nativeNdx = Create_RescueSection4(orientation,
                                      newSectionName,
                                      (modelIn == null) ? 0 : modelIn.nativeNdx,
                                      type,
                                      (i_axis == null) ? 0 : i_axis.nativeNdx,
                                      i_origin,
                                      i_step,
                                      i_lowbound,
                                      i_count,
                                      (j_axis == null) ? 0 : j_axis.nativeNdx,
                                      j_origin,
                                      j_step,
                                      j_lowbound,
                                      j_count,
                                      missingValue);
  }

  public java.lang.String SectionName()
  {
    java.lang.String myReturn = SectionName5(nativeNdx);
    return myReturn;
  }

  public void SetSectionName(java.lang.String newSectionName)
  {
    SetSectionName6(nativeNdx
                   ,newSectionName);
  }

  public RescueModel ParentModel()
  {
    long returnNdx = ParentModel7(nativeNdx);
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

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType8(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public boolean IsNamed(java.lang.String possibleName)
  {
    boolean myReturn = IsNamed9(nativeNdx
                                  ,possibleName);
    return myReturn;
  }

  private native void Delete_RescueSection(long ndx);
  private native long Create_RescueSection1(int orientation,
                                           java.lang.String newSectionName,
                                           long parentModel,
                                           int typeIn,
                                           long i_lowbound,
                                           long i_count,
                                           long j_lowbound,
                                           long j_count,
                                           float missingValue);
  private native long Create_RescueSection2(int orientation,
                                           java.lang.String newSectionName,
                                           long parentModel,
                                           int typeIn,
                                           float missingValue);
  private native long Create_RescueSection3(int orientation,
                                           java.lang.String newSectionName,
                                           long parentModel,
                                           int typeIn,
                                           long i_lowbound,
                                           long i_count,
                                           long j_lowbound,
                                           long j_count,
                                           float missingValue,
                                           float[] tripletArray);
  private native long Create_RescueSection4(int orientation,
                                           java.lang.String newSectionName,
                                           long modelIn,
                                           int type,
                                           long i_axis,
                                           float i_origin,
                                           float i_step,
                                           long i_lowbound,
                                           long i_count,
                                           long j_axis,
                                           float j_origin,
                                           float j_step,
                                           long j_lowbound,
                                           long j_count,
                                           float missingValue);
  private native java.lang.String SectionName5(long refNdx);
  private native void SetSectionName6(long refNdx
                                     ,java.lang.String newSectionName);
  private native long ParentModel7(long refNdx);
  private native boolean IsOfType8(long refNdx
                                  ,int thisType);
  private native boolean IsNamed9(long refNdx
                                 ,java.lang.String possibleName);
}
