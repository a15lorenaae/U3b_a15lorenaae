package lorena.u3b_a15lorenaae;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Lorena on 12/10/2015.
 */
public class dialogolista extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity())
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Escolle unha opción")
                .setItems(R.array.elementosdialogoselect, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String[] opcions = getResources().getStringArray(R.array.elementosdialogoselect);
                        Toast.makeText(getActivity(), "Seleccionaches: '" + opcions[which] + "'", 1).show();
                    }
                });
        return builder.create();
    }
}