package lorena.u3b_a15lorenaae;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

/**
 * Created by Lorena on 12/10/2015.
 */
public class dialogo_mensaje extends DialogFragment{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity())
                .setTitle("Atención")
                .setMessage("Nova mensaxe. Preme o botón 'Back' para volver a pantalla principal")
                .setIcon(android.R.drawable.ic_dialog_info);
                return builder.create();

    }

}
