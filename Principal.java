
public class Principal {
    public static void main(String[] args) {
        //pedindo o nome do Tamagotchi ao usuario
        String nomepet=Teclado.leString("Digite o nome que você quer para o seu Tamagotchi: ");
        Tamagotchi a = new Tamagotchi(nomepet);
        //inicio do loop do while
        while (true) {
            a.aleatorio();
            //verificação da idade do Tamagotchi para caso ele tenha mais de 15 dias
            if (a.getIdade() >= 15) {
                System.out.println("Seu Tamagotchi está velho! Ele alcançou os 15 dias de vida e morreu...");
                break;
            }
            //verificação do Tamagotchi para caso ele tenha mais de 20 quilos
            if (a.getPeso()>=20){
                System.out.println("Seu Tamagotchi pesa mais de 20 quilos e explodiu!");
                break;
            }
            //verificação do Tamagotchi caso ele tenha menos de 0 quilos
            if (a.getPeso()<=0){
                System.out.println("Seu Tamagotchi chegou a 0 quilos! Ele ficou desnutrido e morreu...");
                break;
            }
        }
    }
}