using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueSection : RescueSurface
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
                       string newSectionName,
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
                       string newSectionName,
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
                       string newSectionName,
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
                       string newSectionName,
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

  public string SectionName()
  {
    string myReturn = SectionName5(nativeNdx);
    return myReturn;
  }

  public void SetSectionName(string newSectionName)
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

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType8(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public bool IsNamed(string possibleName)
  {
    bool myReturn = IsNamed9(nativeNdx
                                  ,possibleName);
    return myReturn;
  }

}

}