package pe.push_notification.alumno.push_notification;

/**
 * Created by alumno on 22/09/2017.
 */
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFarebaseIntanceIDService extends FirebaseInstanceIdService{
    private static final String TAG = "MyFirebaseInsIDservice";

    @Override
    public void  onTokenRefresh(){
        super.onTokenRefresh();
        String refresedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG,"New Token" + refresedToken);
    }
}
