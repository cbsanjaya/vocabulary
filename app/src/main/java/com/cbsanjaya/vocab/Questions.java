package com.cbsanjaya.vocab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Questions {

    private Vocab[] vocabs = {
            new Vocab(true, "Memiliki", "have;had;had;having"),
            new Vocab(true, "Melakukan", "do;did;done;doing"),
            new Vocab(true, "Mengatakan", "say;said;said;saying"),
            new Vocab(true, "Pergi", "go;went;gone;going"),
            new Vocab(true, "Mendapatkan", "get;got;got;getting"),
            new Vocab(true, "Membuat", "make;made;made;making"),
            new Vocab(true, "Mengetahui", "know;knew;known;knowing"),
            new Vocab(true, "Memikirkan", "think;thought;thought;thinking"),
            new Vocab(true, "Mengambil", "take;took;taken;taking"),
            new Vocab(true, "Melihat", "see;saw;seen;seeing"),
            new Vocab(true, "Datang", "come;came;come;coming"),
            new Vocab(true, "Menginginkan", "want;wanted;wanted;wanting"),
            new Vocab(true, "Menggunakan", "use;used;used;using"),
            new Vocab(true, "Menemukan", "find;found;found;finding"),
            new Vocab(true, "Memberi", "give;gave;given;giving"),
            new Vocab(false, "tumpul", "dull"),
            new Vocab(false, "penemuan", "discovery"),
            new Vocab(false, "percaya diri", "confident"),
            new Vocab(false, "usaha", "effort"),
            new Vocab(false, "kasar (sikap, kata)", "rude"),
            new Vocab(false, "dampak", "effect"),
            new Vocab(false, "ramah", "friendly"),
            new Vocab(false, "pengalaman", "experience"),
            new Vocab(false, "jujur", "honest"),
            new Vocab(false, "kesalahan", "mistake"),

            new Vocab(true, "Memberitahu", "tell;told;told;telling"),
            new Vocab(true, "Bekerja", "work;worked;worked;working"),
            new Vocab(true, "Menelpon", "call;called;called;calling"),
            new Vocab(true, "Mencoba", "try;tried;tried;trying"),
            new Vocab(true, "Menanyakan", "ask;asked;asked;asking"),
            new Vocab(true, "Membutuhkan", "need;needed;needed;needing"),
            new Vocab(true, "Merasakan", "feel;felt;felt;feeling"),
            new Vocab(true, "Menjadi", "become;became;become;becoming"),
            new Vocab(true, "Meninggalkan", "leave;left;left;leaving"),
            new Vocab(true, "Meletakkan", "put;put;put;putting"),
            new Vocab(true, "Mengingatkan", "remind;reminded;reminded;reminding"),
            new Vocab(true, "Menjaga", "keep;kept;kept;keeping"),
            new Vocab(true, "Membiarkan", "let;let;let;letting"),
            new Vocab(true, "Memulai", "begin;began;begun;beginning"),
            new Vocab(true, "Kelihatan", "seem;seemed;seemed;seeming"),
            new Vocab(false, "rendah hati", "humble"),
            new Vocab(false, "alasan", "reason"),
            new Vocab(false, "mandiri", "independent"),
            new Vocab(false, "hasil", "result"),
            new Vocab(false, "ceria", "cheerful"),
            new Vocab(false, "jalan keluar", "solution"),
            new Vocab(false, "sakit sakitan", "sickly"),
            new Vocab(false, "tugas", "assignment"),
            new Vocab(false, "terampil", "skillful"),
            new Vocab(false, "pengetahuan", "knowledge"),

            new Vocab(true, "Membantu", "help;helped;helped;helping"),
            new Vocab(true, "Menunjukkan", "show;showed;shown;showing"),
            new Vocab(true, "Mendengarkan", "hear;heard;heard;hearing"),
            new Vocab(true, "Bermain", "play;played;played;playing"),
            new Vocab(true, "Berlari", "run;ran;run;running"),
            new Vocab(true, "Berpindah/bergerak", "move;moved;moved;moving"),
            new Vocab(true, "Hidup", "live;lived;lived;living"),
            new Vocab(true, "Percaya", "believe;believed;believed;believing"),
            new Vocab(true, "Membawa", "bring;brought;brought;bringing"),
            new Vocab(true, "Terjadi", "happen;happened;happened;happening"),
            new Vocab(true, "Menulis", "write;wrote;written;writing"),
            new Vocab(true, "Duduk", "sit;sat;sat;sitting"),
            new Vocab(true, "Berdiri", "stand;stood;stood;standing"),
            new Vocab(true, "Kehilangan", "lose;lost;lost;losing"),
            new Vocab(true, "Membayar", "pay;paid;paid;paying"),
            new Vocab(false, "sering lupa", "forgetful"),
            new Vocab(false, "pelajaran", "lesson"),
            new Vocab(false, "nyaman", "comfortable"),
            new Vocab(false, "jadwal", "schedule"),
            new Vocab(false, "pandai", "clever"),
            new Vocab(false, "pembayaran", "payment"),
            new Vocab(false, "takut", "afraid of"),
            new Vocab(false, "pergerakan", "movement"),
            new Vocab(false, "marah", "angry with"),
            new Vocab(false, "kepercayaan", "belief"),

            new Vocab(true, "Bertemu", "meet;met;met;meeting"),
            new Vocab(true, "Termasuk", "include;included;included;including"),
            new Vocab(true, "Melanjutkan", "continue;continued;continued;continuing"),
            new Vocab(true, "Mengatur", "set;set;set;setting"),
            new Vocab(true, "Mempelajari", "learn;learnt;learnt;learning"),
            new Vocab(true, "Mengubah", "change;changed;changed;changing"),
            new Vocab(true, "Memimpin", "lead;led;led;leading"),
            new Vocab(true, "Memahami", "understand;understood;understood;understanding"),
            new Vocab(true, "Menonton", "watch;watched;watched;watching"),
            new Vocab(true, "Mengikuti", "follow;followed;followed;following"),
            new Vocab(true, "Berhenti", "stop;stopped;stopped;stopping"),
            new Vocab(true, "Menciptakan", "create;created;created;creating"),
            new Vocab(true, "Berbicara", "speak;spoke;spoken;speaking"),
            new Vocab(true, "Membaca", "read;read;read;reading"),
            new Vocab(true, "Menghabiskan", "spend;spent;spent;spending"),
            new Vocab(false, "sombong", "arrogant"),
            new Vocab(false, "Pertemuan, rapat", "meeting"),
            new Vocab(false, "kejam", "cruel"),
            new Vocab(false, "ciptaan", "creation"),
            new Vocab(false, "cerewet", "fussy"),
            new Vocab(false, "beasiswa", "scholarship"),
            new Vocab(false, "serakah", "greedy"),
            new Vocab(false, "ilmu", "science"),
            new Vocab(false, "apek, pengap", "musty"),
            new Vocab(false, "ujian", "test"),

            new Vocab(true, "Tumbuh", "grow;grew;grown;growing"),
            new Vocab(true, "Membuka", "open;opened;opened;opening"),
            new Vocab(true, "Berjalan", "walk;walked;walked;walking"),
            new Vocab(true, "Memenangkan", "win;won;won;winning"),
            new Vocab(true, "Mengajar", "teach;taught;taught;teaching"),
            new Vocab(true, "Menawarkan", "offer;offered;offered;offering"),
            new Vocab(true, "Mengingat", "remember;remembered;remembered;remembering"),
            new Vocab(true, "Mempertimbangkan", "consider;considered;considered;considering"),
            new Vocab(true, "Muncul", "appear;appeared;appeared;appearing"),
            new Vocab(true, "Membeli", "buy;bought;bought;buying"),
            new Vocab(true, "Melayani", "serve;served;served;serving"),
            new Vocab(true, "Mati", "die;died;died;dying"),
            new Vocab(true, "Mengirim", "send;sent;sent;sending"),
            new Vocab(true, "Membangun", "build;built;built;building"),
            new Vocab(true, "Tinggal", "stay;stayed;stayed;staying"),
            new Vocab(false, "nakal", "naughty"),
            new Vocab(false, "batas", "border"),
            new Vocab(false, "Gugup", "nervous"),
            new Vocab(false, "bangunan", "building"),
            new Vocab(false, "egois", "selfish"),
            new Vocab(false, "jarak", "distance"),
            new Vocab(false, "Bertanggung Jawab", "responsible"),
            new Vocab(false, "bentuk", "shape"),
            new Vocab(false, "keras kepala", "stubborn"),
            new Vocab(false, "puncak", "top"),

            new Vocab(true, "Jatuh", "fall;fell;fallen;falling"),
            new Vocab(true, "Memotong", "cut;cut;cut;cutting"),
            new Vocab(true, "Menggapai", "reach;reached;reached;reaching"),
            new Vocab(true, "Membunuh", "kill;killed;killed;killing"),
            new Vocab(true, "Mengangkat", "raise;raised;raised;raising"),
            new Vocab(true, "Melewati", "pass;passed;passed;passing"),
            new Vocab(true, "Menjual", "sell;sold;sold;selling"),
            new Vocab(true, "Memutuskan", "decide;decided;decided;deciding"),
            new Vocab(true, "Kembali", "return;returned;returned;returning"),
            new Vocab(true, "Menjelaskan", "explain;explained;explained;explaining"),
            new Vocab(true, "Berharap", "hope;hoped;hoped;hoping"),
            new Vocab(true, "Mengembangkan", "develop;developed;developed;developing"),
            new Vocab(true, "Membawa/memikul", "carry;carried;carried;carrying"),
            new Vocab(true, "Merusak", "break;broke;broken;breaking"),
            new Vocab(true, "Menerima", "receive;received;received;receiving"),
            new Vocab(false, "berbeda", "different"),
            new Vocab(false, "pembunuh", "killer"),
            new Vocab(false, "penting", "important"),
            new Vocab(false, "keputusan", "decision"),
            new Vocab(false, "sederhana", "simple"),
            new Vocab(false, "penjelasan", "explanation"),
            new Vocab(false, "asing, aneh", "strange"),
            new Vocab(false, "perkembangan", "development"),
            new Vocab(false, "istimewa", "special"),
            new Vocab(false, "fikiran", "mind"),

            new Vocab(true, "Setuju", "agree;agreed;agreed;agreeing"),
            new Vocab(true, "Mendukung", "support;supported;supported;supporting"),
            new Vocab(true, "Menabrak", "hit;hit;hit;hitting"),
            new Vocab(true, "Menghasilkan", "produce;produced;produced;producing"),
            new Vocab(true, "Makan", "eat;ate;eaten;eating"),
            new Vocab(true, "Menutupi", "cover;covered;covered;covering"),
            new Vocab(true, "Menangkap", "catch;caught;caught;catching"),
            new Vocab(true, "Menggambar", "draw;drew;drawn;drawing"),
            new Vocab(true, "Memilih", "choose;chose;chosen;choosing"),
            new Vocab(true, "Minum", "drink;drank;drunk;drinking"),
            new Vocab(true, "Menyewa", "rent;rented;rented;renting"),
            new Vocab(true, "Meminjam", "borrow;borrowed;borrowed;borrowing"),
            new Vocab(true, "Terbang", "fly;flew;flown;flying"),
            new Vocab(true, "Menawar", "bargain;bargained;bargained;bargaining"),
            new Vocab(true, "Memukul", "beat;beat;beaten;beating"),
            new Vocab(false, "Pengecut, Penakut", "coward"),
            new Vocab(false, "persetujuan", "agreement"),
            new Vocab(false, "Keras", "loud"),
            new Vocab(false, "pilihan", "choice"),
            new Vocab(false, "cungkring", "skinny"),
            new Vocab(false, "kemampuan", "ability"),
            new Vocab(false, "ramping", "slim"),
            new Vocab(false, "kebiasaan", "habit"),
            new Vocab(false, "Kabur, Suram", "hazy"),
            new Vocab(false, "kelakuan", "attitude"),

            new Vocab(true, "Membengkokkan", "bend;bent;bent;bending"),
            new Vocab(true, "Menggigit", "bite;bit;bitten;biting"),
            new Vocab(true, "Meniup", "blow;blew;blown;blowing"),
            new Vocab(true, "Membakar", "burn;burnt;burnt;burning"),
            new Vocab(true, "Menggali", "dig;dug;dug;digging"),
            new Vocab(true, "Mengendarai", "drive;drove;driven;driving"),
            new Vocab(true, "Berkelahi", "fight;fought;fought;fighting"),
            new Vocab(true, "Melarang", "forbid;forbade;forbidden;forbidding"),
            new Vocab(true, "Melupakan", "forget;forgot;forgotten;forgetting"),
            new Vocab(true, "Memaafkan", "forgive;forgave;forgiven;forgiving"),
            new Vocab(true, "Menggantung", "hang;hung;hung;hanging"),
            new Vocab(true, "Bersembunyi", "hide;hid;hidden;hiding"),
            new Vocab(true, "Memegang", "hold;held;held;holding"),
            new Vocab(true, "Melukai", "hurt;hurt;hurt;hurting"),
            new Vocab(true, "Meminjami", "lend;lent;lent;lending"),
            new Vocab(false, "senang, gembira", "glad"),
            new Vocab(false, "naluri", "instinct"),
            new Vocab(false, "tembem", "chubby"),
            new Vocab(false, "angin", "wind"),
            new Vocab(false, "Gatal", "itchy"),
            new Vocab(false, "api", "fire"),
            new Vocab(false, "palsu", "fake"),
            new Vocab(false, "tanah", "soil"),
            new Vocab(false, "Adil", "fair"),
            new Vocab(false, "petualangan", "adventure"),

            new Vocab(true, "Berbohong", "lie;lied;lied;lying"),
            new Vocab(true, "Menggoyangkan", "shake;shook;shaken;shaking"),
            new Vocab(true, "Menembak", "shoot;shot;shot;shooting"),
            new Vocab(true, "Menutup", "shut;shut;shut;shutting"),
            new Vocab(true, "Bernyanyi", "sing;sang;sung;singing"),
            new Vocab(true, "Tenggelam", "sink;sank;sunk;sinking"),
            new Vocab(true, "Mengapung", "float;floated;floated;floating"),
            new Vocab(true, "Tidur", "sleep;slept;slept;sleeping"),
            new Vocab(true, "Membau", "smell;smelt;smelt;smelling"),
            new Vocab(true, "Meludah", "spit;spat;spat;spitting"),
            new Vocab(true, "Ngiler", "drool;drooled;drooled;drooling"),
            new Vocab(true, "Menyebarkan", "spread;spread;spread;spreading"),
            new Vocab(true, "Mencuri", "steal;stole;stolen;stealing"),
            new Vocab(true, "Merampok", "rob;robbed;robbed;robbing"),
            new Vocab(true, "Membajak", "hijack;hijacked;hijacked;hijacking"),
            new Vocab(false, "Sesak, Ramai", "crowded"),
            new Vocab(false, "kesepakatan", "deal"),
            new Vocab(false, "Sepi", "quiet"),
            new Vocab(false, "niat", "intention"),
            new Vocab(false, "Berisik", "noisy"),
            new Vocab(false, "janji ketemuan", "appointment"),
            new Vocab(false, "Bingung", "confused"),
            new Vocab(false, "air ludah/liur ", "spittle"),
            new Vocab(false, "licin", "slippery"),
            new Vocab(false, "pencuri", "thief"),

            new Vocab(true, "Menghukum", "punish;punished;punished;punishing"),
            new Vocab(true, "Bersumpah", "swear;swore;sworn;swearing"),
            new Vocab(true, "Menyapu", "sweep;swept;swept;sweeping"),
            new Vocab(true, "Berenang", "swim;swam;swum;swimming"),
            new Vocab(true, "Merobek", "tear;tore;torn;tearing"),
            new Vocab(true, "Melempar", "throw;threw;thrown;throwing"),
            new Vocab(true, "Mengenakan", "wear;wore;worn;wearing"),
            new Vocab(true, "Mengeja", "spell;spelt;spelt;spelling"),
            new Vocab(true, "Mengunjungi", "visit;visited;visited;visiting"),
            new Vocab(true, "Mengundang", "invite;invited;invited;inviting"),
            new Vocab(true, "Menggambarkan", "describe;described;described;describing"),
            new Vocab(true, "Memecahkan Masalah", "solve;solved;solved;solving"),
            new Vocab(true, "Mendekati", "approach;approached;approached;approaching"),
            new Vocab(true, "Mengkhianati", "betray;betrayed;betrayed;betraying"),
            new Vocab(true, "Merencanakan", "plan;planned;planned;planning"),
            new Vocab(false, "Terkenal", "famous"),
            new Vocab(false, "hukuman", "punishment"),
            new Vocab(false, "Menyakitkan", "painful"),
            new Vocab(false, "sapu", "broom"),
            new Vocab(false, "luas", "large"),
            new Vocab(false, "gambaran", "description"),
            new Vocab(false, "Dangkal", "shallow"),
            new Vocab(false, "pengunjung", "visitor"),
            new Vocab(false, "berat", "heavy"),
            new Vocab(false, "pengkhianat", "betrayer"),

            new Vocab(true, "Menunggu", "wait for;waited for;waited for;waiting for"),
            new Vocab(true, "Meningkatkan", "increase;increased;increased;increasing"),
            new Vocab(true, "Bermimpi", "dream;dreamt;dreamt;dreaming"),
            new Vocab(true, "Menyisir", "comb;combed;combed;combing"),
            new Vocab(true, "Berdoa, sholat", "pray;prayed;prayed;praying"),
            new Vocab(true, "Menghafalkan", "memorize;memorized;memorized;memorizing"),
            new Vocab(true, "Menyiapkan", "prepare;prepared;prepared;preparing"),
            new Vocab(true, "Bercerai", "divorce;divorced;divorced;divorcing"),
            new Vocab(true, "Menemani", "accompany;accompanied;accompanied;accompanying"),
            new Vocab(true, "Berpisah", "separate;separated;separated;separating"),
            new Vocab(true, "Membersihkan", "clean;cleaned;cleaned;cleaning"),
            new Vocab(true, "Merendam", "soak;soaked;soaked;soaking"),
            new Vocab(true, "Mencuci", "wash;washed;washed;washing"),
            new Vocab(true, "Membilas", "rinse;rinsed;rinsed;rinsing"),
            new Vocab(true, "Mengeringkan", "dry;dried;dried;drying"),
            new Vocab(false, "Sangat Besar", "huge"),
            new Vocab(false, "persiapan", "preparation"),
            new Vocab(false, "Ringan", "light"),
            new Vocab(false, "pakaian", "clothes"),
            new Vocab(false, "Keras, tegas", "Strict"),
            new Vocab(false, "kegiatan", "activity"),
            new Vocab(false, "pilih kasih", "partial"),
            new Vocab(false, "manfaat", "benefit"),
            new Vocab(false, "Harum", "fragrant"),
            new Vocab(false, "kenyataan", "reality"),

            new Vocab(true, "Menyetrika", "iron;ironed;ironed;ironing"),
            new Vocab(true, "Menguras", "drain;drained;drained;draining"),
            new Vocab(true, "Mengepel", "mop;mopped;mopped;mopping"),
            new Vocab(true, "Mengelap (debu)", "dust;dusted;dusted;dusting"),
            new Vocab(true, "Memasak", "cook;cooked;cooked;cooking"),
            new Vocab(true, "Merebus", "boil;boiled;boiled;boiling"),
            new Vocab(true, "Memanggang", "roast;roasted;roasted;roasting"),
            new Vocab(true, "Mengangguk", "nod;nodded;nodded;nodding"),
            new Vocab(true, "Menatap", "stare;stared;stared;staring"),
            new Vocab(true, "Mengintip", "peep;peeped;peeped;peeping"),
            new Vocab(true, "Menangis", "cry;cried;cried;crying"),
            new Vocab(true, "Tertawa", "laugh;laughed;laughed;laughing"),
            new Vocab(true, "Tersenyum", "smile;smiled;smiled;smiling"),
            new Vocab(true, "Berkedip", "blink;blinked;blinked;blinking"),
            new Vocab(true, "Bersin", "sneeze;sneezed;sneezed;sneezing"),
            new Vocab(false, "Tajam", "sharp"),
            new Vocab(false, "lesung pipi", "dimple"),
            new Vocab(false, "Lengket", "sticky"),
            new Vocab(false, "ingus", "snot"),
            new Vocab(false, "Asam kecut", "sour"),
            new Vocab(false, "tahi lalat", "mole"),
            new Vocab(false, "Pahit", "bitter"),
            new Vocab(false, "ketombe", "dandruff"),
            new Vocab(false, "Asin", "salty"),
            new Vocab(false, "air mata", "tear"),

            new Vocab(true, "Menelan", "Swallow;swallowed;swallowed;swallowing"),
            new Vocab(true, "Bersendawa", "burp;burped;burped;burping"),
            new Vocab(true, "Melamun", "daydream;daydreamed;daydreamed;daydreaming"),
            new Vocab(true, "Mendengkur", "snore;snored;snored;snoring"),
            new Vocab(true, "Menguap", "yawn;yawned;yawned;yawning"),
            new Vocab(true, "Ngambek", "sulk;sulked;sulked;sulking"),
            new Vocab(true, "Bersiul", "whistle;whistled;whistled;whistling"),
            new Vocab(true, "Berbisik", "whisper;whispered;whispered;whispering"),
            new Vocab(true, "Menyapa", "address;addressed;addressed;addressing"),
            new Vocab(true, "Mengenalkan", "introduce;introduced;introduced;introducing"),
            new Vocab(true, "Menyambut", "welcome;welcomed;welcomed;welcoming"),
            new Vocab(true, "Mempersilahkan", "please;pleased;pleased;pleasing"),
            new Vocab(true, "Tiba", "arrive;arrived;arrived;arriving"),
            new Vocab(true, "Berkumpul", "gather;gathered;gathered;gathering"),
            new Vocab(true, "Mengumpulkan", "collect;collected;collected;collecting"),
            new Vocab(false, "luar biasa", "wonderful"),
            new Vocab(false, "kegagalan", "failure"),
            new Vocab(false, "Bangga", "proud of"),
            new Vocab(false, "kebebasan pribadi", "privacy"),
            new Vocab(false, "Terang", "bright"),
            new Vocab(false, "imbalan", "reward"),
            new Vocab(false, "Gelap", "dark"),
            new Vocab(false, "kekayaan", "wealth"),
            new Vocab(false, "Dalam", "deep"),
            new Vocab(false, "nama baik ", "reputation"),

            new Vocab(true, "Bercanda", "joke;joked;joked;joking"),
            new Vocab(true, "Menendang", "kick;kicked;kicked;kicking"),
            new Vocab(true, "Menyentuh", "touch;touched;touched;touching"),
            new Vocab(true, "Meraba", "grope;groped;groped;groping"),
            new Vocab(true, "Menggaruk", "scratch;scratched;scratched;scratching"),
            new Vocab(true, "Mencubit", "pinch;pinched;pinched;pinching"),
            new Vocab(true, "Memesan", "order;ordered;ordered;ordering"),
            new Vocab(true, "Menolak", "refuse;refused;refused;refusing"),
            new Vocab(true, "Menyatakan", "state;stated;stated;stating"),
            new Vocab(true, "Mengungkapkan", "express;expressed;expressed;expressing"),
            new Vocab(true, "Menambah", "add;added;added;adding"),
            new Vocab(true, "Menghitung", "count;counted;counted;counting"),
            new Vocab(true, "Menyebutkan", "mention;mentioned;mentioned;mentioning"),
            new Vocab(true, "Menghadiri", "attend;attended;attended;attending"),
            new Vocab(true, "Berbagi", "share;shared;shared;sharing"),
            new Vocab(false, "Keras, sukar", "hard"),
            new Vocab(false, "pernyataan", "statement"),
            new Vocab(false, "Lembut", "soft"),
            new Vocab(false, "tambahan", "addition"),
            new Vocab(false, "Halus", "smooth"),
            new Vocab(false, "gaya hidup", "lifestyle"),
            new Vocab(false, "Kasar (permukaan)", "rough"),
            new Vocab(false, "pertemanan", "friendship"),
            new Vocab(false, "Ketat, erat", "tight"),
            new Vocab(false, "hubungan", "relation"),

            new Vocab(true, "Membagi", "divide;divided;divided;dividing"),
            new Vocab(true, "Bergabung", "join;joined;joined;joining"),
            new Vocab(true, "Menasehati", "advise;advised;advised;advising"),
            new Vocab(true, "Menghindari", "avoid;avoided;avoided;avoiding"),
            new Vocab(true, "Menebak", "guess;guessed;guessed;guessing"),
            new Vocab(true, "Menekan", "press;pressed;pressed;pressing"),
            new Vocab(true, "Mengunyah", "chew;chewed;chewed;chewing"),
            new Vocab(true, "Mengunci", "lock;locked;locked;locking"),
            new Vocab(true, "Menampar", "slap;slapped;slapped;slapping"),
            new Vocab(true, "Memperbaiki", "repair;repaired;repaired;repairing"),
            new Vocab(true, "Menghias", "decorate;decorated;decorated;decorating"),
            new Vocab(true, "Memperingatkan", "warn;warned;warned;warning"),
            new Vocab(true, "Mengendalikan", "control;controlled;controlled;controlling"),
            new Vocab(true, "Mengetik", "type;typed;typed;typing"),
            new Vocab(true, "Menyalahkan", "blame;blamed;blamed;blaming"),
            new Vocab(false, "Puas", "satisfied"),
            new Vocab(false, "nasehat", "advice"),
            new Vocab(false, "bijaksana", "wise"),
            new Vocab(false, "tekanan", "pressure"),
            new Vocab(false, "Manja", "spoiled"),
            new Vocab(false, "gembok", "padlock"),
            new Vocab(false, "Sunyi, diam", "silent"),
            new Vocab(false, "kemarahan", "anger"),
            new Vocab(false, "Kalem, tenang", "calm"),
            new Vocab(false, "keberanian", "courage"),

            new Vocab(true, "Begadang", "stay up;stayed up;stayed up;staying up"),
            new Vocab(true, "Merayu", "flatter;flattered;flattered;flattering"),
            new Vocab(true, "Berteriak", "shout;shouted;shouted;shouting"),
            new Vocab(true, "Menjerit", "scream;screamed;screamed;screaming"),
            new Vocab(true, "Menculik", "kidnap;kidnapped;kidnapped;kidnapping"),
            new Vocab(true, "Berjudi", "gamble;gambled;gambled;gambling"),
            new Vocab(true, "Menghapus", "erase;erased;erased;erasing"),
            new Vocab(true, "Menghancurkan", "destroy;destroyed;destroyed;destroying"),
            new Vocab(true, "Mendorong", "push;pushed;pushed;pushing"),
            new Vocab(true, "Menarik", "pull;pulled;pulled;pulling"),
            new Vocab(true, "Berjuang", "struggle;struggled;struggled;struggling"),
            new Vocab(true, "Menyerang", "attack;attacked;attacked;attacking"),
            new Vocab(true, "Mengeluh", "complain;complained;complained;complaining"),
            new Vocab(true, "Memuji", "praise;praised;praised;praising"),
            new Vocab(true, "Menghina", "insult;insulted;insulted;insulting"),
            new Vocab(false, "Kecewa", "disappointed"),
            new Vocab(false, "suara", "voice"),
            new Vocab(false, "Rumit", "complicated"),
            new Vocab(false, "kehancuran", "destruction"),
            new Vocab(false, "Kaku", "stiff"),
            new Vocab(false, "bahaya", "danger"),
            new Vocab(false, "Serius", "serious"),
            new Vocab(false, "rasa sakit", "pain"),
            new Vocab(false, "Unik", "unique"),
            new Vocab(false, "rasa takut", "fear")
    };

    public ArrayList<Vocab> gallery = new ArrayList<>();
    public static final int CHAPTER_ALL = 0;
    public static final int CHAPTER_1 = 1;
    public static final int CHAPTER_2 = 2;
    public static final int CHAPTER_3 = 3;
    public static final int CHAPTER_4 = 4;
    public static final int CHAPTER_5 = 5;
    public static final int CHAPTER_6 = 6;
    public static final int CHAPTER_7 = 7;
    public static final int CHAPTER_8 = 8;
    public static final int CHAPTER_9 = 9;
    public static final int CHAPTER_10 = 10;
    public static final int CHAPTER_11 = 11;
    public static final int CHAPTER_12 = 12;
    public static final int CHAPTER_13 = 13;
    public static final int CHAPTER_14 = 14;
    public static final int CHAPTER_15 = 15;
    public static final int CHAPTER_16 = 16;
    public static final int CHAPTER_REVIEW_1 = 17;
    public static final int CHAPTER_REVIEW_2 = 18;
    public static final int CHAPTER_REVIEW_3 = 19;

    public Questions() {
        this(CHAPTER_ALL);
    }

    public Questions(int chapter) {
        switch (chapter) {
            case CHAPTER_ALL:
                Collections.addAll(this.gallery, this.vocabs);
                break;
            case CHAPTER_REVIEW_1:
                this.gallery.addAll(Arrays.asList(this.vocabs).subList(0, 99));
                break;
            case CHAPTER_REVIEW_2:
                this.gallery.addAll(Arrays.asList(this.vocabs).subList(0, 199));
                break;
            case CHAPTER_REVIEW_3:
                this.gallery.addAll(Arrays.asList(this.vocabs).subList(0, 299));
                break;
            case CHAPTER_1:
                this.gallery.addAll(Arrays.asList(this.vocabs).subList(0, 24));
                break;
            case CHAPTER_2:
                this.gallery.addAll(Arrays.asList(this.vocabs).subList(25, 49));
                break;
            case CHAPTER_3:
                this.gallery.addAll(Arrays.asList(this.vocabs).subList(50, 74));
                break;
            case CHAPTER_4:
                this.gallery.addAll(Arrays.asList(this.vocabs).subList(75, 99));
                break;
            case CHAPTER_5:
                this.gallery.addAll(Arrays.asList(this.vocabs).subList(100, 124));
                break;
            case CHAPTER_6:
                this.gallery.addAll(Arrays.asList(this.vocabs).subList(125, 149));
                break;
            case CHAPTER_7:
                this.gallery.addAll(Arrays.asList(this.vocabs).subList(150, 174));
                break;
            case CHAPTER_8:
                this.gallery.addAll(Arrays.asList(this.vocabs).subList(175, 199));
                break;
            case CHAPTER_9:
                this.gallery.addAll(Arrays.asList(this.vocabs).subList(200, 224));
                break;
            case CHAPTER_10:
                this.gallery.addAll(Arrays.asList(this.vocabs).subList(225, 249));
                break;
            case CHAPTER_11:
                this.gallery.addAll(Arrays.asList(this.vocabs).subList(250, 274));
                break;
            case CHAPTER_12:
                this.gallery.addAll(Arrays.asList(this.vocabs).subList(275, 299));
                break;
            case CHAPTER_13:
                this.gallery.addAll(Arrays.asList(this.vocabs).subList(300, 324));
                break;
            case CHAPTER_14:
                this.gallery.addAll(Arrays.asList(this.vocabs).subList(325, 349));
                break;
            case CHAPTER_15:
                this.gallery.addAll(Arrays.asList(this.vocabs).subList(350, 374));
                break;
            case CHAPTER_16:
                this.gallery.addAll(Arrays.asList(this.vocabs).subList(375, 399));
                break;
        }

        Collections.shuffle(this.gallery);
    }
}
