package com.catshouse.sabedoriadiaria2.ui.eclesiastes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.catshouse.sabedoriadiaria2.R
import java.util.*

class EclesiastesFragment : Fragment() {

    private lateinit var galleryViewModel: EclesiastesViewModel
    lateinit var textViewMensagem : TextView
    lateinit var buttonPedir : Button

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        galleryViewModel =
                ViewModelProvider(this).get(EclesiastesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        textViewMensagem = root.findViewById(R.id.textViewMensagem)
        buttonPedir = root.findViewById(R.id.buttonPedir)
        buttonPedir.setOnClickListener {

            fun frasesDoDia() {
                //val frasesdodia = findViewById<TextView>(R.id.textViewMensagem)
                //val x = Random().nextInt(174)
                val frases = arrayOf(
                        """
               Que proveito tem o homem, de todo o seu trabalho, que faz debaixo do sol?

               Eclesiastes 1:3
                """.trimIndent(),
                        """
               Uma geração vai, e outra geração vem; mas a terra para sempre permanece.

               Eclesiastes 1:4
                """.trimIndent(),
                        """
               Todos os rios vão para o mar, e contudo o mar não se enche; ao lugar para onde os rios vão, para ali tornam eles a correr.

               Eclesiastes 1:7
                """.trimIndent(),
                        """
               Todas as coisas são trabalhosas; o homem não o pode exprimir; os olhos não se fartam de ver, nem os ouvidos se enchem de ouvir.

               Eclesiastes 1:8
                """.trimIndent(),
                        """
               Aquilo que é torto não se pode endireitar; aquilo que falta não se pode calcular.

               Eclesiastes 1:15
                """.trimIndent(),
                        """
               Porque na muita sabedoria há muito enfado; e o que aumenta em conhecimento, aumenta em dor.

               Eclesiastes 1:18
                """.trimIndent(),
                        """
               Então vi eu que a sabedoria é mais excelente do que a estultícia, quanto a luz é mais excelente do que as trevas.

               Eclesiastes 2:13
                """.trimIndent(),
                        """
               Os olhos do homem sábio estão na sua cabeça, mas o louco anda em trevas; então também entendi eu que o mesmo lhes sucede a ambos.

               Eclesiastes 2:14
                """.trimIndent(),
                        """
               E como morre o sábio, assim morre o tolo!

               Eclesiastes 2:16
                """.trimIndent(),
                        """
               Porque há homem cujo trabalho é feito com sabedoria, conhecimento, e destreza; contudo deixará o seu trabalho como porção de quem nele não trabalhou; também isto é vaidade e grande mal.

               Eclesiastes 2:21
                """.trimIndent(),
                        """
               Tudo tem o seu tempo determinado, e há tempo para todo o propósito debaixo do céu.

               Eclesiastes 3:1
                """.trimIndent(),
                        """
               Há tempo de nascer, e tempo de morrer; tempo de plantar, e tempo de arrancar o que se plantou;

               Eclesiastes 3:2
                """.trimIndent(),
                        """
               (Há)Tempo de chorar, e tempo de rir; tempo de prantear, e tempo de dançar;

               Eclesiastes 3:4
                """.trimIndent(),
                        """
               Todos vão para um lugar; todos foram feitos do pó, e todos voltarão ao pó.

               Eclesiastes 3:20
                """.trimIndent(),
                        """
               Também vi eu que todo o trabalho, e toda a destreza em obras, traz ao homem a inveja do seu próximo. Também isto é vaidade e aflição de espírito.

               Eclesiastes 4:4
                """.trimIndent(),
                        """
               Melhor é a mão cheia com descanso do que ambas as mãos cheias com trabalho, e aflição de espírito.

               Eclesiastes 4:6
                """.trimIndent(),
                        """
               Melhor é serem dois do que um, porque têm melhor paga do seu trabalho.

               Eclesiastes 4:9
                """.trimIndent(),
                        """
               Melhor é a criança pobre e sábia do que o rei velho e insensato, que não se deixa mais admoestar.

               Eclesiastes 4:13
                """.trimIndent(),
                        """
               Vi a todos os viventes andarem debaixo do sol com a criança, a sucessora, que ficará no seu lugar.

               Eclesiastes 4:15
                """.trimIndent(),
                        """
               Porque, da muita ocupação vêm os sonhos, e a voz do tolo da multidão das palavras.

               Eclesiastes 5:3
                """.trimIndent(),
                        """
               Quem amar o dinheiro jamais dele se fartará; e quem amar a abundância nunca se fartará da renda; também isto é vaidade.

               Eclesiastes 5:10
                """.trimIndent(),
                        """
               Onde os bens se multiplicam, ali se multiplicam também os que deles comem

               Eclesiastes 5:11
                """.trimIndent(),
                        """
               Há um grave mal que vi debaixo do sol, e atrai enfermidades: as riquezas que os seus donos guardam para o seu próprio dano;

               Eclesiastes 5:13
                """.trimIndent(),
                        """
               Como saiu do ventre de sua mãe, assim nu tornará, indo-se como veio; e nada tomará do seu trabalho, que possa levar na sua mão.

               Eclesiastes 5:15
                """.trimIndent(),
                        """
               Se o homem gerar cem filhos, e viver muitos anos, e os dias dos seus anos forem muitos, e se a sua alma não se fartar do bem, e além disso não tiver sepultura, digo que um aborto é melhor do que ele.

               Eclesiastes 6:3
                """.trimIndent(),
                        """
               E, ainda que vivesse duas vezes mil anos e não gozasse o bem, não vão todos para um mesmo lugar?

               Eclesiastes 6:6
                """.trimIndent(),
                        """
               Melhor é a vista dos olhos do que o vaguear da cobiça; também isto é vaidade e aflição de espírito.

               Eclesiastes 6:9
                """.trimIndent(),
                        """
               Melhor é ir à casa onde há luto do que ir à casa onde há banquete, porque naquela está o fim de todos os homens, e os vivos o aplicam ao seu coração.

               Eclesiastes 7:2
                """.trimIndent(),
                        """
               Melhor é a mágoa do que o riso, porque com a tristeza do rosto se faz melhor o coração.

               Eclesiastes 7:3
                """.trimIndent(),
                        """
               O coração dos sábios está na casa do luto, mas o coração dos tolos na casa da alegria.

               Eclesiastes 7:4
                """.trimIndent(),
                        """
               Melhor é ouvir a repreensão do sábio, do que ouvir alguém a canção do tolo.

               Eclesiastes 7:5
                """.trimIndent(),
                        """
               Melhor é o fim das coisas do que o princípio delas; melhor é o paciente de espírito do que o altivo de espírito.

               Eclesiastes 7:8
                """.trimIndent(),
                        """
               Não te apresses no teu espírito a irar-te, porque a ira repousa no íntimo dos tolos.

               Eclesiastes 7:9
                """.trimIndent(),
                        """
               Nunca digas: Por que foram os dias passados melhores do que estes? Porque não provém da sabedoria esta pergunta.

               Eclesiastes 7:10
                """.trimIndent(),
                        """
               Tão boa é a sabedoria como a herança, e dela tiram proveito os que vêem o sol.

               Eclesiastes 7:11
                """.trimIndent(),
                        """
               No dia da prosperidade goza do bem, mas no dia da adversidade considera

               Eclesiastes 7:14
                """.trimIndent(),
                        """
               Não sejas demasiadamente justo, nem demasiadamente sábio; por que te destruirias a ti mesmo?

               Eclesiastes 7:16
                """.trimIndent(),
                        """
               Na verdade que não há homem justo sobre a terra, que faça o bem, e nunca peque.

               Eclesiastes 7:20
                """.trimIndent(),
                        """
               Porque para todo o propósito há seu tempo e juízo; porquanto a miséria do homem pesa sobre ele.

               Eclesiastes 8:6
                """.trimIndent(),
                        """
               Tudo sucede igualmente a todos; o mesmo sucede ao justo e ao ímpio

               Eclesiastes 9:2
                """.trimIndent(),
                        """
               Tudo quanto te vier à mão para fazer, faze-o conforme as tuas forças

               Eclesiastes 9:10
                """.trimIndent(),
                        """
               E, até quando o tolo vai pelo caminho, falta-lhe o seu entendimento e diz a todos que é tolo.

               Eclesiastes 10:3
                """.trimIndent(),
                        """
               Seguramente a serpente morderá antes de estar encantada, e o falador não é melhor.

               Eclesiastes 10:11
                """.trimIndent(),
                        """
               Por muita preguiça se enfraquece o teto, e pela frouxidão das mãos a casa goteja.

               Eclesiastes 10:18
                """.trimIndent(),
                        """
               Reparte com sete, e ainda até com oito, porque não sabes que mal haverá sobre a terra.

               Eclesiastes 11:2
                """.trimIndent(),
                        """
               Quem observa o vento, nunca semeará, e o que olha para as nuvens nunca segará.

               Eclesiastes 11:4
                """.trimIndent(),
                        """
               Porém, se o homem viver muitos anos, e em todos eles se alegrar, também se deve lembrar dos dias das trevas, porque hão de ser muitos

               Eclesiastes 11:8
                """.trimIndent(),
                        """
               Afasta, pois, a ira do teu coração, e remove da tua carne o mal, porque a adolescência e a juventude são vaidade.

               Eclesiastes 11:10
                """.trimIndent()
                )
                val x = Random().nextInt(frases.size)
                textViewMensagem.text = frases[x]
            }
            frasesDoDia()
        }
       /* val textView: TextView = root.findViewById(R.id.textViewMensagem)
        galleryViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/

        return root
    }
}