package com.catshouse.sabedoriadiaria2.ui.proverbios

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

class ProverbiosFragment : Fragment() {

    private lateinit var homeViewModel: ProverbiosViewModel
    lateinit var textViewMensagem : TextView
    lateinit var buttonPedir : Button


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        homeViewModel =
                ViewModelProvider(this).get(ProverbiosViewModel::class.java)
        var root = inflater.inflate(R.layout.fragment_home, container, false)
        textViewMensagem = root.findViewById(R.id.textViewMensagem)
        buttonPedir = root.findViewById(R.id.buttonPedir)
        buttonPedir.setOnClickListener {

            fun frasesDoDia() {
                //val frasesdodia = findViewById<TextView>(R.id.textViewMensagem)
                val x = Random().nextInt(174)
                val frases = arrayOf(
                        """
                O sábio ouvirá e crescerá em conhecimento, e o entendido adquirirá sábios conselhos;
                
                Provérbios 1:5
                """.trimIndent(),
                        """
                Filho meu, se os pecadores procuram te atrair com agrados, não aceites.
                
                Provérbios 1:10
                """.trimIndent(),
                        """
                O temor do Senhor é o princípio do conhecimento; os loucos desprezam a sabedoria e a instrução.
                
                Provérbios 1:7
                """.trimIndent(),
                        """
                Filho meu, ouve a instrução de teu pai, e não deixes o ensinamento de tua mãe,
                
                Provérbios 1:8
                """.trimIndent(),
                        """
                Filho meu, se os pecadores procuram te atrair com agrados, não aceites.
                
                Provérbios 1:10
                """.trimIndent(),
                        """
                Filho meu, não te ponhas a caminho com eles; desvia o teu pé das suas veredas;
                
                Provérbios 1:15
                """.trimIndent(),
                        """
                São assim as veredas de todo aquele que usa de cobiça: ela põe a perder a alma dos que a possuem.
                
                Provérbios 1:19
                """.trimIndent(),
                        """
                O bom siso te guardará e a inteligência te conservará;
                Para te afastar do mau caminho, e do homem que fala coisas perversas;
                
                Provérbios 2:11,12
                """.trimIndent(),
                        """
                Para te afastar da mulher estranha, sim da estranha que lisonjeia com suas palavras;
                
                Provérbios 2:16
                """.trimIndent(),
                        """
                Filho meu, não te esqueças da minha lei, e o teu coração guarde os meus mandamentos.
                
                Provérbios 3:1
                """.trimIndent(),
                        """
                Não sejas sábio a teus próprios olhos; teme ao Senhor e aparta-te do mal.
                
                Provérbios 3:7
                """.trimIndent(),
                        """
                Porque o Senhor repreende aquele a quem ama, assim como o pai ao filho a quem quer bem.
                
                Provérbios 3:12
                """.trimIndent(),
                        """
                Bem-aventurado o homem que acha sabedoria, e o homem que adquire conhecimento;
                
                Provérbios 3:13
                """.trimIndent(),
                        """
                Não deixes de fazer bem a quem o merece, estando em tuas mãos a capacidade de fazê-lo.
                
                Provérbios 3:27
                """.trimIndent(),
                        """
                Não digas ao teu próximo: Vai, e volta amanhã que to darei, se já o tens contigo.
                
                Provérbios 3:28
                """.trimIndent(),
                        """
                Não maquines o mal contra o teu próximo, pois que habita contigo confiadamente.
                
                Provérbios 3:29
                """.trimIndent(),
                        """
                Não contendas com alguém sem causa, se não te fez nenhum mal.
                
                Provérbios 3:30
                """.trimIndent(),
                        """
                Não tenhas inveja do homem violento, nem escolhas nenhum dos seus caminhos.
                
                Provérbios 3:31
                """.trimIndent(),
                        """
                Ouvi, filhos, a instrução do pai, e estai atentos para conhecerdes a prudência.
                
                Provérbios 4:1
                """.trimIndent(),
                        """
                A sabedoria é a coisa principal; adquire pois a sabedoria, emprega tudo o que possuis na aquisição de entendimento.
                
                Provérbios 4:7
                """.trimIndent(),
                        """
                Não entres pela vereda dos ímpios, nem andes no caminho dos maus.
                
                Provérbios 4:14
                """.trimIndent(),
                        """
                Sobre tudo o que se deve guardar, guarda o teu coração, porque dele procedem as fontes da vida.
                
                Provérbios 4:23
                """.trimIndent(),
                        """
                Desvia de ti a falsidade da boca, e afasta de ti a perversidade dos lábios.
                
                Provérbios 4:24
                """.trimIndent(),
                        """
                Os teus olhos olhem para a frente, e as tuas pálpebras olhem direto diante de ti.
                
                Provérbios 4:25
                """.trimIndent(),
                        """
                Pondera a vereda de teus pés, e todos os teus caminhos sejam bem ordenados!
                
                Provérbios 4:26
                """.trimIndent(),
                        """
                Não declines nem para a direita nem para a esquerda; retira o teu pé do mal.
                
                Provérbios 4:27
                """.trimIndent(),
                        """
                Porque os lábios da mulher estranha destilam favos de mel, e o seu paladar é mais suave do que o azeite.
                Mas o seu fim é amargoso como o absinto, agudo como a espada de dois gumes.
                
                Provérbios 5:3,4
                """.trimIndent(),
                        """
                Filho meu, se ficaste por fiador do teu companheiro, e te prendeste nas palavras da tua boca;
                livra-te, já que caíste nas mãos do teu companheiro: vai, humilha-te, e importuna o teu companheiro.
                
                Provérbios 6:1-3
                """.trimIndent(),
                        """
                Vai ter com a formiga, ó preguiçoso; olha para os seus caminhos, e sê sábio.
                
                Provérbios 6:6
                """.trimIndent(),
                        """
                Filho meu, guarda o mandamento de teu pai, e não deixes a lei da tua mãe;
                
                Provérbios 6:20
                """.trimIndent(),
                        """
                Porque por causa duma prostituta se chega a pedir um bocado de pão; e a adúltera anda à caça da alma preciosa.
                
                Provérbios 6:26
                """.trimIndent(),
                        """
                Assim ficará o que entrar à mulher do seu próximo; não será inocente todo aquele que a tocar.
                
                Provérbios 6:29
                """.trimIndent(),
                        """
                Assim, o que adultera com uma mulher é falto de entendimento; aquele que faz isso destrói a sua alma.
                
                Provérbios 6:32
                """.trimIndent(),
                        """
                Não se desvie para os caminhos dela o teu coração, e não te deixes perder nas suas veredas.
                
                Provérbios 7:25
                """.trimIndent(),
                        """
                Porque melhor é a sabedoria do que os rubis; e tudo o que mais se deseja não se pode comparar com ela.
                
                Provérbios 8:11
                """.trimIndent(),
                        """
                O temor do Senhor é odiar o mal; a soberba e a arrogância, o mau caminho e a boca perversa, eu odeio.
                
                Provérbios 8:13
                """.trimIndent(),
                        """
                Deixai os insensatos e vivei; e andai pelo caminho do entendimento.
                
                Provérbios 9:6
                """.trimIndent(),
                        """
                O que repreende o escarnecedor, toma afronta para si; e o que censura o ímpio recebe a sua mancha.
                
                Provérbios 9:7
                """.trimIndent(),
                        """
                Não repreendas o escarnecedor, para que não te odeie; repreende o sábio, e ele te amará.
                
                Provérbios 9:8
                """.trimIndent(),
                        """
                Dá instrução ao sábio, e ele se fará mais sábio; ensina o justo e ele aumentará em entendimento.
                
                Provérbios 9:9
                """.trimIndent(),
                        """
                O temor do Senhor é o princípio da sabedoria, e o conhecimento do Santo a prudência.
                
                Provérbios 9:10
                """.trimIndent(),
                        """
                Se fores sábio, para ti serás sábio; e, se fores escarnecedor, só tu o suportarás.
                
                Provérbios 9:12
                """.trimIndent(),
                        """
                Provérbios de Salomão: O filho sábio alegra a seu pai, mas o filho insensato é a tristeza de sua mãe.
                
                Provérbios 10:1
                """.trimIndent(),
                        """
                Os tesouros da impiedade de nada aproveitam; mas a justiça livra da morte.
                
                Provérbios 10:2
                """.trimIndent(),
                        """
                O Senhor não deixa o justo passar fome, mas rechaça a aspiração dos perversos.
                
                Provérbios 10:3
                """.trimIndent(),
                        """
                O que trabalha com mão displicente empobrece, mas a mão dos diligentes enriquece.
                
                Provérbios 10:4
                """.trimIndent(),
                        """
                O que ajunta no verão é filho ajuizado, mas o que dorme na sega é filho que envergonha.
                
                Provérbios 10:5
                """.trimIndent(),
                        """
                Bênçãos há sobre a cabeça do justo, mas a violência cobre a boca dos perversos.
                
                Provérbios 10:6
                """.trimIndent(),
                        """
                A memória do justo é abençoada, mas o nome dos perversos apodrecerá.
                
                Provérbios 10:7
                """.trimIndent(),
                        """
                O sábio de coração aceita os mandamentos, mas o insensato de lábios ficará transtornado.
                
                Provérbios 10:8
                """.trimIndent(),
                        """
                Quem anda em sinceridade, anda seguro; mas o que perverte os seus caminhos ficará conhecido.
                
                Provérbios 10:9
                """.trimIndent(),
                        """
                O que acena com os olhos causa dores, e o tolo de lábios ficará transtornado.
                
                Provérbios 10:10
                """.trimIndent(),
                        """
                A boca do justo é fonte de vida, mas a violência cobre a boca dos perversos.
                
                Provérbios 10:11
                """.trimIndent(),
                        """
                O ódio excita contendas, mas o amor cobre todos os pecados.
                
                Provérbios 10:12
                """.trimIndent(),
                        """
                Nos lábios do entendido se acha a sabedoria, mas a vara é para as costas do falto de entendimento.
                
                Provérbios 10:13
                """.trimIndent(),
                        """
                Os sábios entesouram a sabedoria; mas a boca do tolo o aproxima da ruína.
                
                Provérbios 10:14
                """.trimIndent(),
                        """
                Os bens do rico são a sua cidade forte, a pobreza dos pobres a sua ruína.
                
                Provérbios 10:15
                """.trimIndent(),
                        """
                A obra do justo conduz à vida, o fruto do perverso, ao pecado.
                
                Provérbios 10:16
                """.trimIndent(),
                        """
                O caminho para a vida é daquele que guarda a instrução, mas o que deixa a repreensão comete erro.
                
                Provérbios 10:17
                """.trimIndent(),
                        """
                O que encobre o ódio tem lábios falsos, e o que divulga má fama é um insensato.
                
                Provérbios 10:18
                """.trimIndent(),
                        """
                Na multidão de palavras não falta pecado, mas o que modera os seus lábios é sábio.
                
                Provérbios 10:19
                """.trimIndent(),
                        """
                Prata escolhida é a língua do justo; o coração dos perversos é de nenhum valor.
                
                Provérbios 10:20
                """.trimIndent(),
                        """
                Os lábios do justo apascentam a muitos, mas os tolos morrem por falta de entendimento.
                
                Provérbios 10:21
                """.trimIndent(),
                        """
                Para o tolo, o cometer desordem é divertimento; mas para o homem entendido é o ter sabedoria.
                
                Provérbios 10:23
                """.trimIndent(),
                        """
                Aquilo que o perverso teme sobrevirá a ele, mas o desejo dos justos será concedido.
                
                Provérbios 10:24
                """.trimIndent(),
                        """
                Como passa a tempestade, assim desaparece o perverso, mas o justo tem fundamento perpétuo.
                
                Provérbios 10:25
                """.trimIndent(),
                        """
                Como vinagre para os dentes, como fumaça para os olhos, assim é o preguiçoso para aqueles que o mandam.
                
                Provérbios 10:26
                """.trimIndent(),
                        """
                Em vindo a soberba, virá também a afronta; mas com os humildes está a sabedoria.
                
                Provérbios 11:2
                """.trimIndent(),
                        """
                O que despreza o seu próximo carece de entendimento, mas o homem entendido se mantém calado.
                
                Provérbios 11:12
                """.trimIndent(),
                        """
                Decerto sofrerá severamente aquele que fica por fiador do estranho, mas o que evita a fiança estará seguro.
                
                Provérbios 11:15
                """.trimIndent(),
                        """
                A mulher graciosa guarda a honra como os violentos guardam as riquezas.
                
                Provérbios 11:16
                """.trimIndent(),
                        """
                O homem bom cuida bem de si mesmo, mas o cruel prejudica o seu corpo.
                
                Provérbios 11:17
                """.trimIndent(),
                        """
                Como jóia de ouro no focinho de uma porca, assim é a mulher formosa que não tem discrição.
                
                Provérbios 11:22
                """.trimIndent(),
                        """
                O desejo dos justos é tão somente para o bem, mas a esperança dos ímpios é criar contrariedades.
                
                Provérbios 11:23
                """.trimIndent(),
                        """
                Ao que distribui mais se lhe acrescenta, e ao que retém mais do que é justo, é para a sua perda.
                
                Provérbios 11:24
                """.trimIndent(),
                        """
                A alma generosa prosperará e aquele que atende também será atendido.
                
                Provérbios 11:25
                """.trimIndent(),
                        """
                O que ama a instrução ama o conhecimento, mas o que odeia a repreensão é estúpido.
                
                Provérbios 12:1
                """.trimIndent(),
                        """
                A mulher virtuosa é a coroa do seu marido, mas a que o envergonha é como podridão nos seus ossos.
                
                Provérbios 12:4
                """.trimIndent(),
                        """
                Os pensamentos dos justos são retos, mas os conselhos dos ímpios, engano.
                
                Provérbios 12:5
                """.trimIndent(),
                        """
                As palavras dos ímpios são ciladas para derramar sangue, mas a boca dos retos os livrará.
                
                Provérbios 12:6
                """.trimIndent(),
                        """
                Melhor é o que se estima em pouco, e tem servos, do que o que se vangloria e tem falta de pão.
                
                Provérbios 12:9
                """.trimIndent(),
                        """
                O justo tem consideração pela vida dos seus animais, mas as afeições dos ímpios são cruéis.
                
                Provérbios 12:10
                """.trimIndent(),
                        """
                O que lavra a sua terra se fartará de pão; mas o que segue os ociosos é falto de juízo.
                
                Provérbios 12:11
                """.trimIndent(),
                        """
                O ímpio se enlaça na transgressão dos lábios, mas o justo sairá da angústia.
                
                Provérbios 12:13
                """.trimIndent(),
                        """
                Cada um se fartará do fruto da sua boca, e da obra das suas mãos o homem receberá a recompensa.
                
                Provérbios 12:14
                """.trimIndent(),
                        """
                O caminho do insensato é reto aos seus próprios olhos, mas o que dá ouvidos ao conselho é sábio.
                
                Provérbios 12:15
                """.trimIndent(),
                        """
                A ira do insensato se conhece no mesmo dia, mas o prudente encobre a afronta.
                
                Provérbios 12:16
                """.trimIndent(),
                        """
                O que guarda a sua boca conserva a sua alma, mas o que abre muito os seus lábios se destrói.
                
                Provérbios 13:3
                """.trimIndent(),
                        """
                O justo odeia a palavra de mentira, mas o ímpio faz vergonha e se confunde.
                
                Provérbios 13:5
                """.trimIndent(),
                        """
                Há alguns que se fazem de ricos, e não têm coisa nenhuma, e outros que se fazem de pobres e têm muitas riquezas.
                
                Provérbios 13:7
                """.trimIndent(),
                        """
                Da soberba só provém a contenda, mas com os que se aconselham se acha a sabedoria.
                
                Provérbios 13:10
                """.trimIndent(),
                        """
                O que anda com os sábios ficará sábio, mas o companheiro dos tolos será destruído.
                
                Provérbios 13:20
                """.trimIndent(),
                        """
                O que não faz uso da vara odeia seu filho, mas o que o ama, desde cedo o castiga.
                
                Provérbios 13:24
                """.trimIndent(),
                        """
                Toda mulher sábia edifica a sua casa; mas a tola a derruba com as próprias mãos.
                
                Provérbios 14:1
                """.trimIndent(),
                        """
                Não havendo bois o estábulo fica limpo, mas pela força do boi há abundância de colheita.
                
                Provérbios 14:4
                """.trimIndent(),
                        """
                Desvia-te do homem insensato, porque nele não acharás lábios de conhecimento.
                
                Provérbios 14:7
                """.trimIndent(),
                        """
                A sabedoria do prudente é entender o seu caminho, mas a estultícia dos insensatos é engano.
                
                Provérbios 14:8
                """.trimIndent(),
                        """
                O simples dá crédito a cada palavra, mas o prudente atenta para os seus passos.
                
                Provérbios 14:15
                """.trimIndent(),
                        """
                O sábio teme, e desvia-se do mal, mas o tolo se encoleriza, e dá-se por seguro.
                
                Provérbios 14:16
                """.trimIndent(),
                        """
                O que se indigna à toa fará doidices, e o homem de maus intentos será odiado.
                
                Provérbios 14:17
                """.trimIndent(),
                        """
                O pobre é odiado até pelo seu próximo, porém os amigos dos ricos são muitos.
                
                Provérbios 14:20
                """.trimIndent(),
                        """
                O que despreza ao seu próximo peca, mas o que se compadece dos humildes é bem-aventurado.
                
                Provérbios 14:21
                """.trimIndent(),
                        """
                Em todo trabalho há proveito, mas ficar só em palavras leva à pobreza.
                
                Provérbios 14:23
                """.trimIndent(),
                        """
                O longânimo é grande em entendimento, mas o que é de espírito impaciente mostra a sua loucura.
                
                Provérbios 14:29
                """.trimIndent(),
                        """
                O sentimento sadio é vida para o corpo, mas a inveja é podridão para os ossos.
                
                Provérbios 14:30
                """.trimIndent(),
                        """
                O que oprime o pobre insulta àquele que o criou, mas o que se compadece do necessitado o honra.
                
                Provérbios 14:31
                """.trimIndent(),
                        """
                A resposta branda desvia o furor, mas a palavra dura suscita a ira.
                
                Provérbios 15:1
                """.trimIndent(),
                        """
                O tolo despreza a instrução de seu pai, mas o que observa a repreensão se haverá prudentemente.
                
                Provérbios 15:5
                """.trimIndent(),
                        """
                Todos os dias do oprimido são maus, mas o coração alegre é um banquete contínuo.
                
                Provérbios 15:15
                """.trimIndent(),
                        """
                Quão melhor é adquirir a sabedoria do que o ouro! e quão mais excelente é adquirir a prudência do que a prata!
                
                Provérbios 16:16
                """.trimIndent(),
                        """
                Os retos fazem o seu caminho desviar-se do mal; o que guarda o seu caminho preserva a sua alma.
                
                Provérbios 16:17
                """.trimIndent(),
                        """
                A soberba precede a ruína, e a altivez do espírito precede a queda.
                
                Provérbios 16:18
                """.trimIndent(),
                        """
                O coração do sábio instrui a sua boca, e aumenta o ensino dos seus lábios.
                
                Provérbios 16:23
                """.trimIndent(),
                        """
                O homem perverso instiga a contenda, e o intrigante separa os maiores amigos.
                
                Provérbios 16:28
                """.trimIndent(),
                        """
                O que fecha os olhos para imaginar coisas ruins, ao cerrar os lábios pratica o mal.
                
                Provérbios 16:30
                """.trimIndent(),
                        """
                Melhor é o que tarda em irar-se do que o poderoso, e o que controla o seu ânimo do que aquele que toma uma cidade.
                
                Provérbios 16:32
                """.trimIndent(),
                        """
                A repreensão penetra mais profundamente no prudente do que cem açoites no tolo.
                
                Provérbios 17:10
                """.trimIndent(),
                        """
                Quanto àquele que paga o bem com o mal, não se apartará o mal da sua casa.
                
                Provérbios 17:13
                """.trimIndent(),
                        """
                Como o soltar das águas é o início da contenda, assim, antes que sejas envolvido afasta-te da questão.
                
                Provérbios 17:14
                """.trimIndent(),
                        """
                O homem falto de entendimento compromete-se, ficando por fiador na presença do seu amigo.
                
                Provérbios 17:18
                """.trimIndent(),
                        """
                O que responde antes de ouvir comete estultícia que é para vergonha sua.
                
                Provérbios 18:13
                """.trimIndent(),
                        """
                O homem de muitos amigos deve mostrar-se amigável, mas há um amigo mais chegado do que um irmão.
                
                Provérbios 18:24
                """.trimIndent(),
                        """
                Todos os irmãos do pobre o odeiam; quanto mais se afastarão dele os seus amigos! Corre após eles com palavras, que não servem de nada.
                
                Provérbios 19:7
                """.trimIndent(),
                        """
                O filho insensato é uma desgraça para o pai, e um gotejar contínuo as contendas da mulher.
                
                Provérbios 19:13
                """.trimIndent(),
                        """
                O que aflige o seu pai, ou manda embora sua mãe, é filho que traz vergonha e desonra.
                
                Provérbios 19:26
                """.trimIndent(),
                        """
                O vinho é escarnecedor, a bebida forte alvoroçadora; e todo aquele que neles errar nunca será sábio.
                
                Provérbios 20:1
                """.trimIndent(),
                        """
                Honroso é para o homem desviar-se de questões, mas todo tolo é intrometido.
                
                Provérbios 20:3
                """.trimIndent(),
                        """
                Não ames o sono, para que não empobreças; abre os teus olhos, e te fartarás de pão.
                
                Provérbios 20:13
                """.trimIndent(),
                        """
                Nada vale, nada vale, dirá o comprador, mas, indo-se, então se gabará.
                
                Provérbios 20:14
                """.trimIndent(),
                        """
                Ficando alguém por fiador de um estranho, tome-se-lhe a roupa; e por penhor àquele que se obriga pela mulher estranha.
                
                Provérbios 20:16
                """.trimIndent(),
                        """
                O que anda tagarelando revela o segredo; não te intrometas com o que lisonjeia com os seus lábios.
                
                Provérbios 20:19
                """.trimIndent(),
                        """
                O que amaldiçoa seu pai ou sua mãe, apagar-se-á a sua lâmpada em negras trevas.
                
                Provérbios 20:20
                """.trimIndent(),
                        """
                Trabalhar com língua falsa para ajuntar tesouros é vaidade que conduz aqueles que buscam a morte.
                
                Provérbios 21:6
                """.trimIndent(),
                        """
                É melhor morar num canto de telhado do que ter como companheira em casa ampla uma mulher briguenta.
                
                Provérbios 21:9
                """.trimIndent(),
                        """
                O que ama os prazeres padecerá necessidade; o que ama o vinho e o azeite nunca enriquecerá.
                
                Provérbios 21:17
                """.trimIndent(),
                        """
                É melhor morar numa terra deserta do que com a mulher rixosa e irritadiça.
                
                Provérbios 21:19
                """.trimIndent(),
                        """
                O que guarda a sua boca e a sua língua guarda a sua alma das angústias.
                
                Provérbios 21:23
                """.trimIndent(),
                        """
                O desejo do preguiçoso o mata, porque as suas mãos recusam trabalhar.
                
                Provérbios 21:25
                """.trimIndent(),
                        """
                Espinhos e laços há no caminho do perverso; o que guarda a sua alma retira-se para longe dele.
                
                Provérbios 22:5
                """.trimIndent(),
                        """
                Educa a criança no caminho em que deve andar; e até quando envelhecer não se desviará dele.
                
                Provérbios 22:6
                """.trimIndent(),
                        """
                Lança fora o escarnecedor, e se irá a contenda; e acabará a questão e a vergonha.
                
                Provérbios 22:10
                """.trimIndent(),
                        """
                Não sejas companheiro do homem briguento nem andes com o colérico,
                
                Provérbios 22:24
                """.trimIndent(),
                        """
                Não te fatigues para enriqueceres; e não apliques nisso a tua sabedoria.
                
                Provérbios 23:4
                """.trimIndent(),
                        """
                Não fales ao ouvido do tolo, porque desprezará a sabedoria das tuas palavras.
                
                Provérbios 23:9
                """.trimIndent(),
                        """
                Não retires a disciplina da criança; pois se a fustigares com a vara, nem por isso morrerá.
                
                Provérbios 23:13
                """.trimIndent(),
                        """
                Não estejas entre os beberrões de vinho, nem entre os comilões de carne.
                
                Provérbios 23:20
                """.trimIndent(),
                        """
                Porque o beberrão e o comilão acabarão na pobreza; e a sonolência os faz vestir-se de trapos.
                
                Provérbios 23:21
                """.trimIndent(),
                        """
                Ouve teu pai, que te gerou, e não desprezes tua mãe, quando vier a envelhecer.
                
                Provérbios 23:22
                """.trimIndent(),
                        """
                Porque cova profunda é a prostituta, e poço estreito a estranha.
                
                Provérbios 23:27
                """.trimIndent(),
                        """
                Não tenhas inveja dos homens malignos, nem desejes estar com eles.
                
                Provérbios 24:1
                """.trimIndent(),
                        """
                Quando cair o teu inimigo, não te alegres, nem se regozije o teu coração quando ele tropeçar;
                
                Provérbios 24:17
                """.trimIndent(),
                        """
                Não ponhas muito os pés na casa do teu próximo; para que se não enfade de ti, e passe a te odiar.
                
                Provérbios 25:17
                """.trimIndent(),
                        """
                Se o teu inimigo tiver fome, dá-lhe pão para comer; e se tiver sede, dá-lhe água para beber;
                
                Provérbios 25:21
                """.trimIndent(),
                        """
                Melhor é morar só num canto de telhado do que com a mulher briguenta numa casa ampla.
                
                Provérbios 25:24
                """.trimIndent(),
                        """
                Comer mel demais não é bom; assim, a busca da própria glória não é glória.
                
                Provérbios 25:27
                """.trimIndent(),
                        """
                Como a cidade derrubada, sem muro, assim é o homem que não pode conter o seu espírito.
                
                Provérbios 25:28
                """.trimIndent(),
                        """
                Não respondas ao tolo segundo a sua estultícia; para que também não te faças semelhante a ele.
                
                Provérbios 26:4
                """.trimIndent(),
                        """
                Responde ao tolo segundo a sua estultícia, para que não seja sábio aos seus próprios olhos.
                
                Provérbios 26:5
                """.trimIndent(),
                        """
                Tens visto o homem que é sábio a seus próprios olhos? Pode-se esperar mais do tolo do que dele.
                
                Provérbios 26:12
                """.trimIndent(),
                        """
                Não presumas do dia de amanhã, porque não sabes o que ele trará.
                
                Provérbios 27:1
                """.trimIndent(),
                        """
                O gotejar contínuo em dia de grande chuva, e a mulher contenciosa, uma e outra são semelhantes;
                
                Provérbios 27:15
                """.trimIndent(),
                        """
                O homem pobre que oprime os pobres é como a chuva impetuosa, que causa a falta de alimento.
                
                Provérbios 28:3
                """.trimIndent(),
                        """
                O que aumenta os seus bens com usura e ganância ajunta-os para o que se compadece do pobre.
                
                Provérbios 28:8
                """.trimIndent(),
                        """
                O que encobre as suas transgressões nunca prosperará, mas o que as confessa e deixa, alcançará misericórdia.
                
                Provérbios 28:13
                """.trimIndent(),
                        """
                O que lavrar a sua terra virá a fartar-se de pão, mas o que segue a ociosos se fartará de pobreza.
                
                Provérbios 28:19
                """.trimIndent(),
                        """
                Dar importância à aparência das pessoas não é bom, porque até por um bocado de pão um homem prevaricará.
                
                Provérbios 28:21
                """.trimIndent(),
                        """
                O que confia no seu próprio coração é insensato, mas o que anda em sabedoria, será salvo.
                
                Provérbios 28:26
                """.trimIndent(),
                        """
                O homem que ama a sabedoria alegra a seu pai, mas o companheiro de prostitutas desperdiça os bens.
                
                Provérbios 29:3
                """.trimIndent(),
                        """
                O homem que lisonjeia o seu próximo arma uma rede aos seus passos.
                
                Provérbios 29:5
                """.trimIndent(),
                        """
                O justo se informa da causa dos pobres, mas o ímpio nem sequer toma conhecimento.
                
                Provérbios 29:7
                """.trimIndent(),
                        """
                O tolo revela todo o seu pensamento, mas o sábio o guarda até o fim.
                
                Provérbios 29:11
                """.trimIndent(),
                        """
                A vara e a repreensão dão sabedoria, mas a criança entregue a si mesma, envergonha a sua mãe.
                
                Provérbios 29:15
                """.trimIndent(),
                        """
                Tens visto um homem precipitado no falar? Maior esperança há para um tolo do que para ele.
                
                Provérbios 29:20
                """.trimIndent(),
                        """
                Se procedeste loucamente, exaltando-te, e se planejaste o mal, leva a mão à boca;
                
                Provérbios 30:32
                """.trimIndent(),
                        """
                Não dês às mulheres a tua força, nem os teus caminhos ao que destrói os reis.
                
                Provérbios 31:3
                """.trimIndent()
                )
                textViewMensagem.text = frases[x]
            }
            frasesDoDia()
        }


        /*val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it.toString()
        })*/

        return root
    }
}