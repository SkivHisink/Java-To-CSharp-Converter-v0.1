using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueGeometryLGRList : RjniBaseClass
{
	protected RescueGeometryLGRList(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueGeometryLGRList(RescueGeometry geometry, 
																		bool byTimeStep,               // TRUE if order of rows is by time step, by group, by geometry.
                                                                      // FALSE for by group, by time step by geometry.  Of course,
                                                                      // if you limit to a single group or time step this
                                                                      // is immaterial.
																	  RescuePropertyGroup nullOrGroup,  // Non-null, limit to particular RescuePropertyGroup.
																	  string nullOrTimeStepName)
  {
    nativeNdx = Create_RescueGeometryLGRList0((geometry == null) ? 0 : geometry.nativeNdx,
                                                   byTimeStep, 
																									 (nullOrGroup == null) ? 0 : nullOrGroup.nativeNdx,
                                                    nullOrTimeStepName);
  }

	
  public void dispose()
  {
    Delete_RescueGeometryLGRList(nativeNdx);
  }


  public int Count()
  {
    int myReturn = Count1(nativeNdx);
    return myReturn;
  }

  public RescueGeometry NthRowGeometry(long zeroBasedOrdinal)
  {
    long returnNdx = NthRowGeometry3(nativeNdx
                             ,zeroBasedOrdinal);
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

  public RescueTimeStepGroup NthRowTimeStepGroup(long zeroBasedOrdinal)
  {
    long returnNdx = NthRowTimeStepGroup4(nativeNdx
                             ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTimeStepGroup myReturn = new RescueTimeStepGroup(returnNdx);
      return myReturn;
    }
  }

  public RescuePropertyGroup NthRowPropertyGroup(long zeroBasedOrdinal)
  {
    long returnNdx = NthRowPropertyGroup5(nativeNdx
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

}

}