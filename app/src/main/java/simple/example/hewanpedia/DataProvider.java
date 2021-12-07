package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Buaya;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("autralia", "eropa",
                "negara yang terlatak di benua eropa", R.drawable.australia));
        kucings.add(new Kucing("inggris", "eropa",
                "negara yang terlatak di benua eropa", R.drawable.inggris));
        kucings.add(new Kucing("filipina", "Asia",
                "negara yang terlatak di benua asia ", R.drawable.filipina));
        kucings.add(new Kucing("kanada", "eropa",
                " negara yang terlatak di benua eropa", R.drawable.kanada));
        kucings.add(new Kucing("peru", "eropa",
                "negara yang terlatak di benua eropa", R.drawable.peru));
        kucings.add(new Kucing("vietnam", "asia",
                " negara yang terlatak di benua asia", R.drawable.vietnam));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("instagram", "meta",
                "logo ini berasal dari meta grub ", R.drawable.instagram));
        anjings.add(new Anjing("spotify", "china ",
                " logo ini berasal dari china mungkin ", R.drawable.spotify));
        anjings.add(new Anjing("shoope", "singapura",
                " logo ini berasal dari singapura ", R.drawable.shoope));
        anjings.add(new Anjing("twiter", "meta",
                "logo ini berasal dari meta grub ", R.drawable.twiter));
        anjings.add(new Anjing("youtube", "amerika",
                "logo ini berasal dari meta grub ", R.drawable.youtube));
        anjings.add(new Anjing("indosat", "indonesia",
                " logo ini berasal dari indonesia", R.drawable.indosat));
        return anjings;
    }

    private static List<Buaya>initDataBuaya(Context ctx) {
        List<Buaya> buayas = new ArrayList<>();
        buayas.add(new Buaya(" rawon", "bandung",
                "makanan yang populer di daerah bandung ", R.drawable.rawon));
        buayas.add(new Buaya("sate", "padang",
                " makanan yang mempunyai banyak varian ", R.drawable.sate));
        buayas.add(new Buaya("pempek", "palembang",
                "Makanan khas palembang yang terbuat dari berbagi marterial ", R.drawable.pempek));
        buayas.add(new Buaya("bakso", "selong",
                "makanan yang banyak tersebar di indonesia ", R.drawable.bakso));
        buayas.add(new Buaya("rendang", "kabar",
                " daging yang di masak dan di jadikan rendang ", R.drawable.rendang));
        buayas.add(new Buaya("gudeg", "bandung",
                "makan yang berasal dari bandung mungkin ", R.drawable.gudeg));
        return buayas;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataBuaya(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
