package sin.multiprog.usjt.br.meusfilmes;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.lang.reflect.Field;
/**
 *
 *Nome: Claudemir Cardoso da Silva  RA: 816155452
 *
 */

public class Util {
    /**
     *
     *Nome: Claudemir Cardoso da Silva  RA: 816155452
     *
     */
    public static Drawable getImagem(Context context, String nome){
        Class<?> c = R.drawable.class;
        try {
            Field f = c.getDeclaredField(nome);
            int id = f.getInt(f);
            return context.getResources().getDrawable(id, null);
        } catch (NoSuchFieldException e ) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return context.getDrawable(R.drawable.happy);
    }
}
