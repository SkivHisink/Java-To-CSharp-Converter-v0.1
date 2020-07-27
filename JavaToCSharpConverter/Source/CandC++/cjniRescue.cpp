/********************************************************************

  cjniRescue.cpp

  The main object for RESCUE's Classifier Library Java hookup.

  Rod Hanks,  Aug 25 2005

*********************************************************************/
#include <malloc.h>
#include <string.h>
#include "boolSupport.h"
#include "org_Rescue_rjni_classifier.h"
#include "classifier.h"
#include "org_Rescue_rjni_RescueAndUpVersionRule.h"
#include "RescueAndUpVersionRule.h"
#include "org_Rescue_rjni_RescueBeforeVersionRule.h"
#include "RescueBeforeVersionRule.h"
#include "org_Rescue_rjni_RescueBlockAndUnitNumbersNOrMoreRule.h"
#include "RescueBlockAndUnitNumbersNOrMoreRule.h"
#include "org_Rescue_rjni_RescueBlockAndUnitNumbersRule.h"
#include "RescueBlockAndUnitNumbersRule.h"
#include "org_Rescue_rjni_RescueBlockNameRule.h"
#include "RescueBlockNameRule.h"
#include "org_Rescue_rjni_RescueBUHRule.h"
#include "RescueBUHRule.h"
#include "org_Rescue_rjni_RescueClassificationContext.h"
#include "RescueClassificationContext.h"
#include "org_Rescue_rjni_RescueClassificationResult.h"
#include "RescueClassificationResult.h"
#include "org_Rescue_rjni_RescueClassifier.h"
#include "RescueClassifier.h"
#include "org_Rescue_rjni_RescueFaultLimitRule.h"
#include "RescueFaultLimitRule.h"
#include "org_Rescue_rjni_RescueFlavour.h"
#include "RescueFlavour.h"
#include "org_Rescue_rjni_RescueFlavourAFactory.h"
#include "RescueFlavourAFactory.h"
#include "org_Rescue_rjni_RescueFlavourBFactory.h"
#include "RescueFlavourBFactory.h"
#include "org_Rescue_rjni_RescueFlavourCFactory.h"
#include "RescueFlavourCFactory.h"
#include "org_Rescue_rjni_RescueFlavourFactory.h"
#include "RescueFlavourFactory.h"
#include "org_Rescue_rjni_RescueGoodVolumeRule.h"
#include "RescueGoodVolumeRule.h"
#include "org_Rescue_rjni_RescueHaveFaultRelationshipsRule.h"
#include "RescueHaveFaultRelationshipsRule.h"
#include "org_Rescue_rjni_RescueHaveFaultRule.h"
#include "RescueHaveFaultRule.h"
#include "org_Rescue_rjni_RescueHaveTipLoopRule.h"
#include "RescueHaveTipLoopRule.h"
#include "org_Rescue_rjni_RescueLayerToUnitRule.h"
#include "RescueLayerToUnitRule.h"
#include "org_Rescue_rjni_RescueLGRIDRule.h"
#include "RescueLGRIDRule.h"
#include "org_Rescue_rjni_RescueMultiBlockRule.h"
#include "RescueMultiBlockRule.h"
#include "org_Rescue_rjni_RescueNoGlobalsRule.h"
#include "RescueNoGlobalsRule.h"
#include "org_Rescue_rjni_RescueOneBUPerURule.h"
#include "RescueOneBUPerURule.h"
#include "org_Rescue_rjni_RescueParameterizedSurfaceRule.h"
#include "RescueParameterizedSurfaceRule.h"
#include "org_Rescue_rjni_RescuePassRule.h"
#include "RescuePassRule.h"
#include "org_Rescue_rjni_RescuePreV30ValidatorRule.h"
#include "RescuePreV30ValidatorRule.h"
#include "org_Rescue_rjni_RescueRefIdRule.h"
#include "RescueRefIdRule.h"
#include "org_Rescue_rjni_RescueReporter.h"
#include "RescueReporter.h"
#include "org_Rescue_rjni_RescueRule.h"
#include "RescueRule.h"
#include "org_Rescue_rjni_RescueSplitNodesRule.h"
#include "RescueSplitNodesRule.h"
#include "org_Rescue_rjni_RescueStandardModelPropertyGroupingRule.h"
#include "RescueStandardModelPropertyGroupingRule.h"
#include "org_Rescue_rjni_RescueStandardPropertyGroupingRule.h"
#include "RescueStandardPropertyGroupingRule.h"
#include "org_Rescue_rjni_RescueStreamReporter.h"
#include "RescueStreamReporter.h"
#include "org_Rescue_rjni_RescueUnitNameRule.h"
#include "RescueUnitNameRule.h"
#include "org_Rescue_rjni_RescueVersionRule.h"
#include "RescueVersionRule.h"

static void throwByName(JNIEnv *env, const char *name, const char *msg)
{
  jclass cls = env->FindClass(name);

  if (cls != 0)
  {
    env->ThrowNew(cls, msg);
  }
  env->DeleteLocalRef(cls);
}

extern float *copyFloatArray(float *arrayIn, int arrayLength);
extern int *copyIntArray(int *arrayIn, int arrayLength);
extern short *copyShortArray(short *arrayIn, int arrayLength);
extern double *copyDoubleArray(double *arrayIn, int arrayLength);
unsigned char *copyByteArray(unsigned char *arrayIn, int arrayLength);
extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueAndUpVersionRule_Create_1RescueAndUpVersionRule0  (JNIEnv *env, jobject obj
  ,jint version)
{
  try
  {
    RescueAndUpVersionRule *myReturn = new RescueAndUpVersionRule((int) version);
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueAndUpVersionRule_RescueAndUpVersionRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueAndUpVersionRule_Create_1RescueAndUpVersionRule1  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescueAndUpVersionRule *myReturn = new RescueAndUpVersionRule();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueAndUpVersionRule_RescueAndUpVersionRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueAndUpVersionRule_print2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueAndUpVersionRule *myObject = (RescueAndUpVersionRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueAndUpVersionRule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueAndUpVersionRule_apply3
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueAndUpVersionRule *myObject = (RescueAndUpVersionRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueAndUpVersionRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueBeforeVersionRule_Create_1RescueBeforeVersionRule0  (JNIEnv *env, jobject obj
  ,jint version)
{
  try
  {
    RescueBeforeVersionRule *myReturn = new RescueBeforeVersionRule((int) version);
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueBeforeVersionRule_RescueBeforeVersionRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueBeforeVersionRule_Create_1RescueBeforeVersionRule1  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescueBeforeVersionRule *myReturn = new RescueBeforeVersionRule();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueBeforeVersionRule_RescueBeforeVersionRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueBeforeVersionRule_print2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueBeforeVersionRule *myObject = (RescueBeforeVersionRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueBeforeVersionRule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueBeforeVersionRule_apply3
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueBeforeVersionRule *myObject = (RescueBeforeVersionRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueBeforeVersionRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueBlockAndUnitNumbersNOrMoreRule_Create_1RescueBlockAndUnitNumbersNOrMoreRule0  (JNIEnv *env, jobject obj
  ,jint nBlocks)
{
  try
  {
    RescueBlockAndUnitNumbersNOrMoreRule *myReturn = new RescueBlockAndUnitNumbersNOrMoreRule((int) nBlocks);
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueBlockAndUnitNumbersNOrMoreRule_RescueBlockAndUnitNumbersNOrMoreRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueBlockAndUnitNumbersRule_Create_1RescueBlockAndUnitNumbersRule0  (JNIEnv *env, jobject obj
  ,jint nBlocks)
{
  try
  {
    RescueBlockAndUnitNumbersRule *myReturn = new RescueBlockAndUnitNumbersRule((int) nBlocks);
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueBlockAndUnitNumbersRule_RescueBlockAndUnitNumbersRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueBlockNameRule_Create_1RescueBlockNameRule0  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescueBlockNameRule *myReturn = new RescueBlockNameRule();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueBlockNameRule_RescueBlockNameRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueBlockNameRule_print1
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueBlockNameRule *myObject = (RescueBlockNameRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueBlockNameRule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueBlockNameRule_apply2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueBlockNameRule *myObject = (RescueBlockNameRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueBlockNameRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueBUHRule_Create_1RescueBUHRule0  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescueBUHRule *myReturn = new RescueBUHRule();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueBUHRule_RescueBUHRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueBUHRule_print1
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueBUHRule *myObject = (RescueBUHRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueBUHRule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueBUHRule_apply2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueBUHRule *myObject = (RescueBUHRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueBUHRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueClassificationContext_Create_1RescueClassificationContext0  (JNIEnv *env, jobject obj
  ,jlong modelNdx
  ,jstring pathStr
  ,jlong reporterNdx)
{
  try
  {
    RescueModel* model = (RescueModel*) modelNdx;
    jboolean pathBool;
    const char *path = env->GetStringUTFChars(pathStr, &pathBool);
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueClassificationContext *myReturn = new RescueClassificationContext((RescueModel*) model,
                (const char*) path,
                (RescueReporter*) reporter);
    env->ReleaseStringUTFChars(pathStr, path);
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueClassificationContext_RescueClassificationContext");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueClassificationContext_Delete_1RescueClassificationContext
  (JNIEnv *env, jobject obj, jlong objNdx)
{
  try
  {
    RescueClassificationContext *myObj = (RescueClassificationContext *) objNdx;
    delete myObj;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueClassificationContext_~RescueClassificationContext");
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueClassificationContext_model2
  (JNIEnv *env, jobject obj, jlong nativeNdx)
{
  try
  {
    RescueClassificationContext *myObject = (RescueClassificationContext *) nativeNdx;
    RescueModel* myReturn = myObject->model();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueClassificationContext_model");
    return (jlong) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jstring JNICALL Java_org_Rescue_rjni_RescueClassificationContext_path3
  (JNIEnv *env, jobject obj, jlong nativeNdx)
{
  try
  {
    RescueClassificationContext *myObject = (RescueClassificationContext *) nativeNdx;
    RCHString *myReturn = &myObject->path();
    return env->NewStringUTF(myReturn->String());
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jstring) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueClassificationContext_path");
    return (jstring) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueClassificationContext_reporter4
  (JNIEnv *env, jobject obj, jlong nativeNdx)
{
  try
  {
    RescueClassificationContext *myObject = (RescueClassificationContext *) nativeNdx;
    RescueReporter* myReturn = myObject->reporter();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueClassificationContext_reporter");
    return (jlong) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jobjectArray JNICALL Java_org_Rescue_rjni_RescueClassificationContext_appliedRules5
  (JNIEnv *env, jobject obj, jlong nativeNdx)
{
  try
  {
    RescueClassificationContext *myObject = (RescueClassificationContext *) nativeNdx;
    cMySet<RescueClassificationResult> * myReturnCPP = myObject->appliedRules();
    jobjectArray myReturn = 0;
    if (myReturnCPP != 0)
    {
      int howMany = myReturnCPP->Count();
      jclass objClass = env->FindClass("org/Rescue/rjni/RescueClassificationResult");
      jfieldID idID = env->GetFieldID(objClass, "nativeNdx", "J");
      jobject objInstance = env->AllocObject(objClass);
      myReturn = (jobjectArray) env->NewObjectArray(howMany, objClass, objInstance);
      int loop;
      for (loop = 0; loop < howMany; loop++)
      {
        if (loop != 0)
        {
          objInstance = env->AllocObject(objClass);
        }
        env->SetObjectArrayElement(myReturn, loop, objInstance);
        env->SetLongField(objInstance, idID, (long) myReturnCPP->NthObject(loop));
      }
    }
    return myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jobjectArray) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueClassificationContext_appliedRules");
    return (jobjectArray) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueClassificationContext_registerAppliedRule6
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong resultNdx)
{
  try
  {
    RescueClassificationResult* result = (RescueClassificationResult*) resultNdx;
    RescueClassificationContext *myObject = (RescueClassificationContext *) nativeNdx;
    myObject->registerAppliedRule((RescueClassificationResult*) result);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueClassificationContext_registerAppliedRule");
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueClassificationContext_reset7
  (JNIEnv *env, jobject obj, jlong nativeNdx)
{
  try
  {
    RescueClassificationContext *myObject = (RescueClassificationContext *) nativeNdx;
    myObject->reset();
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueClassificationContext_reset");
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueClassificationContext_PreviouslyApplied8
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong exampleRuleNdx)
{
  try
  {
    RescueRule * exampleRule = (RescueRule *) exampleRuleNdx;
    RescueClassificationContext *myObject = (RescueClassificationContext *) nativeNdx;
    RescueClassificationResult * myReturn = myObject->PreviouslyApplied((RescueRule *) exampleRule);
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueClassificationContext_PreviouslyApplied");
    return (jlong) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueClassificationResult_Create_1RescueClassificationResult0  (JNIEnv *env, jobject obj
  ,jlong ruleNdx
  ,jint resultInt)
{
  try
  {
    RescueRule* rule = (RescueRule*) ruleNdx;
    RSQERR result = (RSQERR) resultInt;
    RescueClassificationResult *myReturn = new RescueClassificationResult((RescueRule*) rule,
                (RSQERR) result);
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueClassificationResult_RescueClassificationResult");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueClassifier_Create_1RescueClassifier0  (JNIEnv *env, jobject obj
  ,jobjectArray addonFactoriesJ
  ,jboolean ignoreStandardsBool)
{
  try
  {
    cMySet<RescueFlavourFactory> *addonFactories = 0;
    if (addonFactoriesJ != 0)
    {
      jsize addonFactoriesLength = env->GetArrayLength(addonFactoriesJ);
      if (addonFactoriesLength > 0)
      {
        addonFactories = new cMySet<RescueFlavourFactory>;
        jsize loop2;
        for (loop2 = 0; loop2 < addonFactoriesLength; loop2++)
        {
          jobject element = env->GetObjectArrayElement(addonFactoriesJ, loop2);
          (*addonFactories) += (RescueFlavourFactory *) element;
        }
      }
    }
    RESCUEBOOL ignoreStandards = ((ignoreStandardsBool == JNI_TRUE) ? TRUE : FALSE);
    RescueClassifier *myReturn = new RescueClassifier((cMySet<RescueFlavourFactory> *) addonFactories,
                (RESCUEBOOL) ignoreStandards);
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueClassifier_RescueClassifier");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueClassifier_Delete_1RescueClassifier
  (JNIEnv *env, jobject obj, jlong objNdx)
{
  try
  {
    RescueClassifier *myObj = (RescueClassifier *) objNdx;
    delete myObj;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueClassifier_~RescueClassifier");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueClassifier_apply2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx
  ,jboolean doAllBool)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RESCUEBOOL doAll = ((doAllBool == JNI_TRUE) ? TRUE : FALSE);
    RescueClassifier *myObject = (RescueClassifier *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context,
                (RESCUEBOOL) doAll);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueClassifier_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jboolean JNICALL Java_org_Rescue_rjni_RescueClassifier_IsFlavour3
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx
  ,jstring flavourNameStr
  ,jlong failedRuleNamesNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    jboolean flavourNameBool;
    const char *flavourName = env->GetStringUTFChars(flavourNameStr, &flavourNameBool);
    cSetString* failedRuleNames = (cSetString*) failedRuleNamesNdx;
    RescueClassifier *myObject = (RescueClassifier *) nativeNdx;
    RESCUEBOOL myReturn = myObject->IsFlavour((RescueClassificationContext*) context,
                (char *) flavourName,
                (cSetString*) failedRuleNames);
    env->ReleaseStringUTFChars(flavourNameStr, flavourName);
    return ((myReturn == FALSE) ? (jboolean) false : (jboolean) true);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jboolean) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueClassifier_IsFlavour");
    return (jboolean) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueClassifier_FlavourNamed4
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jstring nameStr)
{
  try
  {
    jboolean nameBool;
    const char *name = env->GetStringUTFChars(nameStr, &nameBool);
    RescueClassifier *myObject = (RescueClassifier *) nativeNdx;
    RescueFlavour * myReturn = myObject->FlavourNamed((char *) name);
    env->ReleaseStringUTFChars(nameStr, name);
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueClassifier_FlavourNamed");
    return (jlong) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jobjectArray JNICALL Java_org_Rescue_rjni_RescueClassifier_Flavours5
  (JNIEnv *env, jobject obj, jlong nativeNdx)
{
  try
  {
    RescueClassifier *myObject = (RescueClassifier *) nativeNdx;
    cMySet<RescueFlavour> * myReturnCPP = myObject->Flavours();
    jobjectArray myReturn = 0;
    if (myReturnCPP != 0)
    {
      int howMany = myReturnCPP->Count();
      jclass objClass = env->FindClass("org/Rescue/rjni/RescueFlavour");
      jfieldID idID = env->GetFieldID(objClass, "nativeNdx", "J");
      jobject objInstance = env->AllocObject(objClass);
      myReturn = (jobjectArray) env->NewObjectArray(howMany, objClass, objInstance);
      int loop;
      for (loop = 0; loop < howMany; loop++)
      {
        if (loop != 0)
        {
          objInstance = env->AllocObject(objClass);
        }
        env->SetObjectArrayElement(myReturn, loop, objInstance);
        env->SetLongField(objInstance, idID, (long) myReturnCPP->NthObject(loop));
      }
    }
    return myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jobjectArray) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueClassifier_Flavours");
    return (jobjectArray) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueFaultLimitRule_Create_1RescueFaultLimitRule0  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescueFaultLimitRule *myReturn = new RescueFaultLimitRule();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueFaultLimitRule_RescueFaultLimitRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueFaultLimitRule_print1
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueFaultLimitRule *myObject = (RescueFaultLimitRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueFaultLimitRule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueFaultLimitRule_apply2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueFaultLimitRule *myObject = (RescueFaultLimitRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueFaultLimitRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueFlavour_Create_1RescueFlavour0  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescueFlavour *myReturn = new RescueFlavour();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueFlavour_RescueFlavour");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueFlavour_registerRule1
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong ruleNdx)
{
  try
  {
    RescueRule* rule = (RescueRule*) ruleNdx;
    RescueFlavour *myObject = (RescueFlavour *) nativeNdx;
    RSQERR myReturn = myObject->registerRule((RescueRule*) rule);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueFlavour_registerRule");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jboolean JNICALL Java_org_Rescue_rjni_RescueFlavour_unregisterRule2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jstring ruleNameStr)
{
  try
  {
    jboolean ruleNameBool;
    const char *ruleName = env->GetStringUTFChars(ruleNameStr, &ruleNameBool);
    RescueFlavour *myObject = (RescueFlavour *) nativeNdx;
    RESCUEBOOL myReturn = myObject->unregisterRule((char *) ruleName);
    env->ReleaseStringUTFChars(ruleNameStr, ruleName);
    return ((myReturn == FALSE) ? (jboolean) false : (jboolean) true);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jboolean) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueFlavour_unregisterRule");
    return (jboolean) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueFlavour_classify3
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx
  ,jboolean doAllBool)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RESCUEBOOL doAll = ((doAllBool == JNI_TRUE) ? TRUE : FALSE);
    RescueFlavour *myObject = (RescueFlavour *) nativeNdx;
    RescueRule * myReturn = myObject->classify((RescueClassificationContext*) context,
                (RESCUEBOOL) doAll);
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueFlavour_classify");
    return (jlong) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueFlavour_classify4
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx
  ,jlong failedRuleNamesNdx)
{
  try
  {
    RescueClassificationContext * context = (RescueClassificationContext *) contextNdx;
    cSetString* failedRuleNames = (cSetString*) failedRuleNamesNdx;
    RescueFlavour *myObject = (RescueFlavour *) nativeNdx;
    myObject->classify((RescueClassificationContext *) context,
                (cSetString*) failedRuleNames);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueFlavour_classify");
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueFlavour_print5
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx
  ,jlong reporterNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueFlavour *myObject = (RescueFlavour *) nativeNdx;
    myObject->print((RescueClassificationContext*) context,
                (RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueFlavour_print");
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueFlavour_print6
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueFlavour *myObject = (RescueFlavour *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueFlavour_print");
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueFlavour_name8
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jstring nameStr)
{
  try
  {
    jboolean nameBool;
    const char *name = env->GetStringUTFChars(nameStr, &nameBool);
    RescueFlavour *myObject = (RescueFlavour *) nativeNdx;
    myObject->name((char*) name);
    env->ReleaseStringUTFChars(nameStr, name);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueFlavour_name");
  }
}

extern "C" 
JNIEXPORT jstring JNICALL Java_org_Rescue_rjni_RescueFlavour_getName9
  (JNIEnv *env, jobject obj, jlong nativeNdx)
{
  try
  {
    RescueFlavour *myObject = (RescueFlavour *) nativeNdx;
    char * myReturn = myObject->getName();
    return env->NewStringUTF(myReturn);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jstring) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueFlavour_getName");
    return (jstring) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueFlavourFactory_create0
  (JNIEnv *env, jobject obj, jlong nativeNdx)
{
  try
  {
    RescueFlavourFactory *myObject = (RescueFlavourFactory *) nativeNdx;
    RescueFlavour* myReturn = myObject->create();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueFlavourFactory_create");
    return (jlong) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueGoodVolumeRule_Create_1RescueGoodVolumeRule0  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescueGoodVolumeRule *myReturn = new RescueGoodVolumeRule();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueGoodVolumeRule_RescueGoodVolumeRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueGoodVolumeRule_print1
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueGoodVolumeRule *myObject = (RescueGoodVolumeRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueGoodVolumeRule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueGoodVolumeRule_apply2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueGoodVolumeRule *myObject = (RescueGoodVolumeRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueGoodVolumeRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueHaveFaultRelationshipsRule_Create_1RescueHaveFaultRelationshipsRule0  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescueHaveFaultRelationshipsRule *myReturn = new RescueHaveFaultRelationshipsRule();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueHaveFaultRelationshipsRule_RescueHaveFaultRelationshipsRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueHaveFaultRelationshipsRule_print1
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueHaveFaultRelationshipsRule *myObject = (RescueHaveFaultRelationshipsRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueHaveFaultRelationshipsRule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueHaveFaultRelationshipsRule_apply2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueHaveFaultRelationshipsRule *myObject = (RescueHaveFaultRelationshipsRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueHaveFaultRelationshipsRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueHaveFaultRule_Create_1RescueHaveFaultRule0  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescueHaveFaultRule *myReturn = new RescueHaveFaultRule();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueHaveFaultRule_RescueHaveFaultRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueHaveFaultRule_print1
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueHaveFaultRule *myObject = (RescueHaveFaultRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueHaveFaultRule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueHaveFaultRule_apply2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueHaveFaultRule *myObject = (RescueHaveFaultRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueHaveFaultRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueHaveTipLoopRule_Create_1RescueHaveTipLoopRule0  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescueHaveTipLoopRule *myReturn = new RescueHaveTipLoopRule();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueHaveTipLoopRule_RescueHaveTipLoopRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueHaveTipLoopRule_print1
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueHaveTipLoopRule *myObject = (RescueHaveTipLoopRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueHaveTipLoopRule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueHaveTipLoopRule_apply2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueHaveTipLoopRule *myObject = (RescueHaveTipLoopRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueHaveTipLoopRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueLayerToUnitRule_Create_1RescueLayerToUnitRule0  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescueLayerToUnitRule *myReturn = new RescueLayerToUnitRule();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueLayerToUnitRule_RescueLayerToUnitRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueLayerToUnitRule_print1
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueLayerToUnitRule *myObject = (RescueLayerToUnitRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueLayerToUnitRule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueLayerToUnitRule_apply2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueLayerToUnitRule *myObject = (RescueLayerToUnitRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueLayerToUnitRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueLGRIDRule_Create_1RescueLGRIDRule0  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescueLGRIDRule *myReturn = new RescueLGRIDRule();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueLGRIDRule_RescueLGRIDRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueLGRIDRule_print1
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueLGRIDRule *myObject = (RescueLGRIDRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueLGRIDRule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueLGRIDRule_apply2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueLGRIDRule *myObject = (RescueLGRIDRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueLGRIDRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueMultiBlockRule_Create_1RescueMultiBlockRule0  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescueMultiBlockRule *myReturn = new RescueMultiBlockRule();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueMultiBlockRule_RescueMultiBlockRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueMultiBlockRule_print1
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueMultiBlockRule *myObject = (RescueMultiBlockRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueMultiBlockRule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueMultiBlockRule_apply2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueMultiBlockRule *myObject = (RescueMultiBlockRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueMultiBlockRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueNoGlobalsRule_Create_1RescueNoGlobalsRule0  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescueNoGlobalsRule *myReturn = new RescueNoGlobalsRule();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueNoGlobalsRule_RescueNoGlobalsRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueNoGlobalsRule_print1
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueNoGlobalsRule *myObject = (RescueNoGlobalsRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueNoGlobalsRule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueNoGlobalsRule_apply2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueNoGlobalsRule *myObject = (RescueNoGlobalsRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueNoGlobalsRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueOneBUPerURule_Create_1RescueOneBUPerURule0  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescueOneBUPerURule *myReturn = new RescueOneBUPerURule();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueOneBUPerURule_RescueOneBUPerURule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueOneBUPerURule_print1
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueOneBUPerURule *myObject = (RescueOneBUPerURule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueOneBUPerURule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueOneBUPerURule_apply2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueOneBUPerURule *myObject = (RescueOneBUPerURule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueOneBUPerURule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueParameterizedSurfaceRule_Create_1RescueParameterizedSurfaceRule0  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescueParameterizedSurfaceRule *myReturn = new RescueParameterizedSurfaceRule();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueParameterizedSurfaceRule_RescueParameterizedSurfaceRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueParameterizedSurfaceRule_print1
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueParameterizedSurfaceRule *myObject = (RescueParameterizedSurfaceRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueParameterizedSurfaceRule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueParameterizedSurfaceRule_apply2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueParameterizedSurfaceRule *myObject = (RescueParameterizedSurfaceRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueParameterizedSurfaceRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescuePassRule_Create_1RescuePassRule0  (JNIEnv *env, jobject obj
  ,jboolean passBool)
{
  try
  {
    RESCUEBOOL pass = ((passBool == JNI_TRUE) ? TRUE : FALSE);
    RescuePassRule *myReturn = new RescuePassRule((RESCUEBOOL) pass);
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescuePassRule_RescuePassRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescuePassRule_Create_1RescuePassRule1  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescuePassRule *myReturn = new RescuePassRule();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescuePassRule_RescuePassRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescuePassRule_print2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescuePassRule *myObject = (RescuePassRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescuePassRule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescuePassRule_apply3
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescuePassRule *myObject = (RescuePassRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescuePassRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jboolean JNICALL Java_org_Rescue_rjni_RescuePassRule_Equals4
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong exampleNdx)
{
  try
  {
    RescueRule * example = (RescueRule *) exampleNdx;
    RescuePassRule *myObject = (RescuePassRule *) nativeNdx;
    RESCUEBOOL myReturn = myObject->Equals((RescueRule *) example);
    return ((myReturn == FALSE) ? (jboolean) false : (jboolean) true);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jboolean) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescuePassRule_Equals");
    return (jboolean) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescuePreV30ValidatorRule_Create_1RescuePreV30ValidatorRule0  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescuePreV30ValidatorRule *myReturn = new RescuePreV30ValidatorRule();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescuePreV30ValidatorRule_RescuePreV30ValidatorRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescuePreV30ValidatorRule_print1
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescuePreV30ValidatorRule *myObject = (RescuePreV30ValidatorRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescuePreV30ValidatorRule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescuePreV30ValidatorRule_apply2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescuePreV30ValidatorRule *myObject = (RescuePreV30ValidatorRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescuePreV30ValidatorRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescuePreV30ValidatorRule_toleranceFactor3
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jdouble factor)
{
  try
  {
    RescuePreV30ValidatorRule *myObject = (RescuePreV30ValidatorRule *) nativeNdx;
    myObject->toleranceFactor((double) factor);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescuePreV30ValidatorRule_toleranceFactor");
  }
}

extern "C" 
JNIEXPORT jdouble JNICALL Java_org_Rescue_rjni_RescuePreV30ValidatorRule_toleranceFactor4
  (JNIEnv *env, jobject obj, jlong nativeNdx)
{
  try
  {
    RescuePreV30ValidatorRule *myObject = (RescuePreV30ValidatorRule *) nativeNdx;
    double myReturn = myObject->toleranceFactor();
    return myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jdouble) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescuePreV30ValidatorRule_toleranceFactor");
    return (jdouble) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueRefIdRule_Create_1RescueRefIdRule0  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescueRefIdRule *myReturn = new RescueRefIdRule();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueRefIdRule_RescueRefIdRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueRefIdRule_print1
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueRefIdRule *myObject = (RescueRefIdRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueRefIdRule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueRefIdRule_apply2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueRefIdRule *myObject = (RescueRefIdRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueRefIdRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueReporter_Delete_1RescueReporter
  (JNIEnv *env, jobject obj, jlong objNdx)
{
  try
  {
    RescueReporter *myObj = (RescueReporter *) objNdx;
    delete myObj;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueReporter_~RescueReporter");
  }
}

extern "C" 
JNIEXPORT jstring JNICALL Java_org_Rescue_rjni_RescueReporter_ClassName1
  (JNIEnv *env, jobject obj, jlong nativeNdx)
{
  try
  {
    RescueReporter *myObject = (RescueReporter *) nativeNdx;
    const char * myReturn = myObject->ClassName();
    return env->NewStringUTF(myReturn);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jstring) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueReporter_ClassName");
    return (jstring) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueRule_apply0
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueRule *myObject = (RescueRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueRule_print1
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueRule *myObject = (RescueRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueRule_print");
  }
}

extern "C" 
JNIEXPORT jboolean JNICALL Java_org_Rescue_rjni_RescueRule_Equals2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong exampleNdx)
{
  try
  {
    RescueRule * example = (RescueRule *) exampleNdx;
    RescueRule *myObject = (RescueRule *) nativeNdx;
    RESCUEBOOL myReturn = myObject->Equals((RescueRule *) example);
    return ((myReturn == FALSE) ? (jboolean) false : (jboolean) true);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jboolean) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueRule_Equals");
    return (jboolean) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jstring JNICALL Java_org_Rescue_rjni_RescueRule_ClassName3
  (JNIEnv *env, jobject obj, jlong nativeNdx)
{
  try
  {
    RescueRule *myObject = (RescueRule *) nativeNdx;
    const char * myReturn = myObject->ClassName();
    return env->NewStringUTF(myReturn);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jstring) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueRule_ClassName");
    return (jstring) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueSplitNodesRule_Create_1RescueSplitNodesRule0  (JNIEnv *env, jobject obj
  ,jboolean wantSplitsInBool)
{
  try
  {
    RESCUEBOOL wantSplitsIn = ((wantSplitsInBool == JNI_TRUE) ? TRUE : FALSE);
    RescueSplitNodesRule *myReturn = new RescueSplitNodesRule((RESCUEBOOL) wantSplitsIn);
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueSplitNodesRule_RescueSplitNodesRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueSplitNodesRule_print1
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueSplitNodesRule *myObject = (RescueSplitNodesRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueSplitNodesRule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueSplitNodesRule_apply2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueSplitNodesRule *myObject = (RescueSplitNodesRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueSplitNodesRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jboolean JNICALL Java_org_Rescue_rjni_RescueSplitNodesRule_Equals3
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong exampleNdx)
{
  try
  {
    RescueRule * example = (RescueRule *) exampleNdx;
    RescueSplitNodesRule *myObject = (RescueSplitNodesRule *) nativeNdx;
    RESCUEBOOL myReturn = myObject->Equals((RescueRule *) example);
    return ((myReturn == FALSE) ? (jboolean) false : (jboolean) true);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jboolean) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueSplitNodesRule_Equals");
    return (jboolean) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueStandardModelPropertyGroupingRule_Create_1RescueStandardModelPropertyGroupingRule0  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescueStandardModelPropertyGroupingRule *myReturn = new RescueStandardModelPropertyGroupingRule();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueStandardModelPropertyGroupingRule_RescueStandardModelPropertyGroupingRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueStandardModelPropertyGroupingRule_print1
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueStandardModelPropertyGroupingRule *myObject = (RescueStandardModelPropertyGroupingRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueStandardModelPropertyGroupingRule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueStandardModelPropertyGroupingRule_apply2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueStandardModelPropertyGroupingRule *myObject = (RescueStandardModelPropertyGroupingRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueStandardModelPropertyGroupingRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueStandardPropertyGroupingRule_Create_1RescueStandardPropertyGroupingRule0  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescueStandardPropertyGroupingRule *myReturn = new RescueStandardPropertyGroupingRule();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueStandardPropertyGroupingRule_RescueStandardPropertyGroupingRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueStandardPropertyGroupingRule_print1
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueStandardPropertyGroupingRule *myObject = (RescueStandardPropertyGroupingRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueStandardPropertyGroupingRule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueStandardPropertyGroupingRule_apply2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueStandardPropertyGroupingRule *myObject = (RescueStandardPropertyGroupingRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueStandardPropertyGroupingRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueStreamReporter_Create_1RescueStreamReporter1  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescueStreamReporter *myReturn = new RescueStreamReporter();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueStreamReporter_RescueStreamReporter");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueUnitNameRule_Create_1RescueUnitNameRule0  (JNIEnv *env, jobject obj
)
{
  try
  {
    RescueUnitNameRule *myReturn = new RescueUnitNameRule();
    return (jlong) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueUnitNameRule_RescueUnitNameRule");
    return (jlong) 0;   // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueUnitNameRule_print1
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueUnitNameRule *myObject = (RescueUnitNameRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueUnitNameRule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueUnitNameRule_apply2
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueUnitNameRule *myObject = (RescueUnitNameRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueUnitNameRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueVersionRule_Delete_1RescueVersionRule
  (JNIEnv *env, jobject obj, jlong objNdx)
{
  try
  {
    RescueVersionRule *myObj = (RescueVersionRule *) objNdx;
    delete myObj;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueVersionRule_~RescueVersionRule");
  }
}

extern "C" 
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueVersionRule_print3
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong reporterNdx)
{
  try
  {
    RescueReporter* reporter = (RescueReporter*) reporterNdx;
    RescueVersionRule *myObject = (RescueVersionRule *) nativeNdx;
    myObject->print((RescueReporter*) reporter);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueVersionRule_print");
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueVersionRule_apply4
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong contextNdx)
{
  try
  {
    RescueClassificationContext* context = (RescueClassificationContext*) contextNdx;
    RescueVersionRule *myObject = (RescueVersionRule *) nativeNdx;
    RSQERR myReturn = myObject->apply((RescueClassificationContext*) context);
    return (jint) myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueVersionRule_apply");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueVersionRule_version5
  (JNIEnv *env, jobject obj, jlong nativeNdx)
{
  try
  {
    RescueVersionRule *myObject = (RescueVersionRule *) nativeNdx;
    int myReturn = myObject->version();
    return myReturn;
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jint) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueVersionRule_version");
    return (jint) 0; // Dummy return prevents compiler warning.
  }
}

extern "C" 
JNIEXPORT jboolean JNICALL Java_org_Rescue_rjni_RescueVersionRule_Equals6
  (JNIEnv *env, jobject obj, jlong nativeNdx  ,jlong exampleNdx)
{
  try
  {
    RescueRule * example = (RescueRule *) exampleNdx;
    RescueVersionRule *myObject = (RescueVersionRule *) nativeNdx;
    RESCUEBOOL myReturn = myObject->Equals((RescueRule *) example);
    return ((myReturn == FALSE) ? (jboolean) false : (jboolean) true);
  }
  catch (char *errorText)
  {
    throwByName(env, "java/lang/RuntimeException", errorText);
    return (jboolean) 0; // Dummy return prevents compiler warning.
  }
  catch (...)
  {
    throwByName(env, "java/lang/RuntimeException", "Unexpected error in RescueVersionRule_Equals");
    return (jboolean) 0; // Dummy return prevents compiler warning.
  }
}

