
//definindo as classes
public class Tamagotchi {
    private String nome;
    private int idade=0;
    private int peso=1;
    private int limiteSono;
    private int nivelFome=0;

    //criando a função do math.random()
    public void aleatorio() {
        //delimitando o limite e o minimo do math.rondom
        int max = 18;
        int min = 0;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;
        //verificando cada ocasião com if's
        //caso for 0,1,2 ou 3 ele não estara com sono
        if (rand <4) {
            System.out.println();
            System.out.println("Seu Tamagotchi não está com sono!");
        }
        //caso for 4, 5 ou 6 ele ira sentir sono
        else if (rand <=6) {
            sentirSono();
        }
        //caso for  7, 8, 9 ou 10 ele estara satisfeito
        else if (rand <=10) {
            System.out.println();
            System.out.println("Seu tamagotchi está satisfeito! ");
        }
        //caso for 11 ou 12 ou 13 ele sentira fome
        else if (rand <=13) {
            sentirFome();
        }
        //caso for 14, 15 ou 16, ele estara alegre
        else if(rand<=16){
            System.out.println();
            System.out.println("Seu tamagotchi está bem alegre!");
        }
        //caso for 17 ou 18 ele ira se sentir entendiado
        else {
            sentirEntediado();
        }
    }

    //função de sentir sono
    public void sentirSono() {
        //impressão do menu de opções de quando sentir sono
        System.out.println();
        System.out.println("Seu Tamagotchi está com sono!");
        System.out.println();
        //menu de informações do Tamagotchi
        System.out.println("Peso: " + peso+" quilo(s)"+ "\tIdade: " + idade + " dia(s)");
        System.out.println("===========================");
        System.out.println("|     1 - Dormir          |");
        System.out.println("|     2 - Não dormir      |");
        System.out.println("===========================");
        int aux = Teclado.leInt("Digite o que quer fazer com ele: ");
        System.out.println("A opção escolhida foi " + aux);
        //verificação da opção digitada pelo usuário
        if (aux == 1) {
            dormir();
        }
        if (aux == 2) {
            System.out.println("Seu Tamagotchi continuou acordado.");
            limiteSono++;
            if (limiteSono==6) {
                System.out.println("Seu Tamagotchi não dormiu por 5 vezes seguidas!");
                dormir();
                limiteSono-=6;
            }
        }
        if (aux>2){
            System.out.println("Opção inválida");
        }
    }

    //função de sentir fome
    public void sentirFome() {
        //impressão do menu de opções de quando sentir fome
        System.out.println();
        System.out.println("Seu Tamagotchi quer comer!");
        System.out.println();
        //menu de informações do Tamagotchi
        System.out.println("Peso: " + peso+" quilo(s)"+ "\tIdade: " + idade + " dia(s)");
        System.out.println("===========================");
        System.out.println("|     1 - Comer muito     |");
        System.out.println("|     2 - Comer pouco     |");
        System.out.println("|     3 - Não comer       |");
        System.out.println("===========================");
        int aux = Teclado.leInt("Digite o que quer fazer com ele: ");
        System.out.println("A opção escolhida foi " + aux);
        //verificação da opção digitada pelo usuário
        if (aux == 1) {
            comerMuito();
        }
        if (aux == 2) {
            comerPouco();
        }
        if (aux == 3) {
            naoComer();
            nivelFome++;
            if (nivelFome>=2){
                System.out.println("Como seu Tamagotchi estava com fome, ele não comeu e perdeu 2 quilos!");
                peso-=2;}
        }
        if (aux>3){
            System.out.println("Opção inválida");
        }
    }

    //função de se sentir entediado
    public void sentirEntediado() {
        //impressão do menu de opções de quando se sentir entediado
        System.out.println();
        System.out.println("Seu Tamagotchi está entediado!");
        System.out.println();
        //menu de informações do Tamagotchi
        System.out.println("Peso: " + peso+" quilo(s)"+ "\tIdade: " + idade + " dia(s)");
        System.out.println("=================================");
        System.out.println("|    1 - Caminhar 10 minutos    |");
        System.out.println("|    2 - Correr 10 minutos      |");
        System.out.println("=================================");
        int aux = Teclado.leInt("Digite o que quer fazer com ele: ");
        System.out.println("A opção escolhida foi " + aux);
        //verificação da opção digitada pelo usuário
        if (aux == 1) {
            caminhar();
        }
        if (aux == 2) {
            correr();
        }
        if (aux>2){
            System.out.println("Opção inválida");
        }
    }

    public Tamagotchi(String nome) {
        this.nome = nome;
        this.idade = 0;
        this.peso=1;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public int getPeso() {
        return this.peso;
    }

    //função das ações de quando o usuário escolher dormir
    public void dormir() {
        idade++;
        if (idade == 1) {
            System.out.println("Seu Tamagotchi dormiu e agora tem 1 dia de vida");
        } else {
            System.out.println("Seu Tamagotchi dormiu e se passou 1 dia. Agora você tem " + idade + " dias de vida");
        }
    }
    //função das ações de quando o usuário escolher comer pouco
    public void comerPouco(){
        System.out.println("Seu Tamagotchi comeu pouco e ganhou 1 quilo.");
        peso++;
        if (peso==1){
            System.out.println("Seu Tamagotchi agora pesa: "+peso+"quilo");}
        else{
            System.out.println("Seu Tamagotchi agora pesa: "+peso+"quilos");
        }
    }
    //função das ações de quando o usuário escolher comer muito
    public void comerMuito(){
        System.out.println("Seu Tamagotchi comeu muito, ganhou 5 quilos e dormiu.");
        peso+=5;
        System.out.println("Seu Tamagotchi agora pesa: "+peso+" quilos");
        dormir();
    }
    //função das ações de quando o usuário escolher não comer
    public void naoComer(){
        System.out.println("Seu Tamagotchi decidiu não comer e ficou com fome. Cuidado!");
    }
    //função das ações de quando o usuário escolher caminhar 10 minutos
    public void caminhar(){
        System.out.println("Seu Tamagotchi decidiu em dar uma caminhada de 10 minutos. Ele perdeu 1 quilo e ficou com fome.");
        peso--;
        nivelFome++;
    }
    //função das ações de quando o usuário escolher correr 10 minutos
    public void correr(){
        if(peso<4){
            System.out.println("Seu Tamagotchi decidiu correr, porém ele não tinha peso suficiente.");
            peso-=4;
        }
        else {
            System.out.println("Seu Tamagotchi decidiu correr durante 10 minutos, perdeu 4 quilos e comeu muito depois.");
            peso -= 4;
            comerMuito();
        }
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }
    public void setPeso(int peso){
        this.peso=peso;
    }
}
