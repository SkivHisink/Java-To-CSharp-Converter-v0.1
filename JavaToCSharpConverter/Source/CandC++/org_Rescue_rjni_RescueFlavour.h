/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_Rescue_rjni_RescueFlavour */

#ifndef _Included_org_Rescue_rjni_RescueFlavour
#define _Included_org_Rescue_rjni_RescueFlavour
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     org_Rescue_rjni_RescueFlavour
 * Method:    Create_RescueFlavour0
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueFlavour_Create_1RescueFlavour0
  (JNIEnv *, jobject);

/*
 * Class:     org_Rescue_rjni_RescueFlavour
 * Method:    registerRule1
 * Signature: (JJ)I
 */
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueFlavour_registerRule1
  (JNIEnv *, jobject, jlong, jlong);

/*
 * Class:     org_Rescue_rjni_RescueFlavour
 * Method:    unregisterRule2
 * Signature: (JLjava/lang/String;)Z
 */
JNIEXPORT jboolean JNICALL Java_org_Rescue_rjni_RescueFlavour_unregisterRule2
  (JNIEnv *, jobject, jlong, jstring);

/*
 * Class:     org_Rescue_rjni_RescueFlavour
 * Method:    classify3
 * Signature: (JJZ)J
 */
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueFlavour_classify3
  (JNIEnv *, jobject, jlong, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueFlavour
 * Method:    classify4
 * Signature: (JJJ)V
 */
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueFlavour_classify4
  (JNIEnv *, jobject, jlong, jlong, jlong);

/*
 * Class:     org_Rescue_rjni_RescueFlavour
 * Method:    print5
 * Signature: (JJJ)V
 */
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueFlavour_print5
  (JNIEnv *, jobject, jlong, jlong, jlong);

/*
 * Class:     org_Rescue_rjni_RescueFlavour
 * Method:    print6
 * Signature: (JJ)V
 */
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueFlavour_print6
  (JNIEnv *, jobject, jlong, jlong);

/*
 * Class:     org_Rescue_rjni_RescueFlavour
 * Method:    name8
 * Signature: (JLjava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueFlavour_name8
  (JNIEnv *, jobject, jlong, jstring);

/*
 * Class:     org_Rescue_rjni_RescueFlavour
 * Method:    getName9
 * Signature: (J)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_org_Rescue_rjni_RescueFlavour_getName9
  (JNIEnv *, jobject, jlong);

#ifdef __cplusplus
}
#endif
#endif
