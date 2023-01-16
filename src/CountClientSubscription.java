import java.util.*;
import java.util.stream.Collectors;

public class CountClientSubscription {

    /*
    Необходимо подсчитать количество подписок заданного типа среди всех переданных клиентов.

    - Результат не должен содержать ключей со значением null;
    - В случае невозможности подсчета результата метод должен возвращать пустую коллекцию.

    Пример.
    Аргументы на вход:
    clients = [subscriptionIds={"id-1"}, subscriptionIds={"id-2", "id-3"}, subscriptionIds={"id-1", "id-2", "id-3"}
    subscriptions = [{subscriptionId= "id-1", type=ANNUAL}, {subscriptionId="id-2", type=QUARTERLY}, {subscriptionId="id-3", type=MONTHLY}]

    Результат:
    { ANNUAL -> 3, QUARTERLY -> 2, MONTHLY -> 1 }
     */
    public static void main(String[] args) {

        List<Subscription> list = List.of(
                new Subscription("1", SubscriptionType.ANNUAL),
                new Subscription("2", SubscriptionType.MONTHLY),
                new Subscription("3", SubscriptionType.ANNUAL),
                new Subscription(null, null)
        );

        List<Client> clientList = List.of(
                new Client(List.of("1", "2")),
                new Client(List.of("3", "2")));


        System.out.println(countClientSubscriptions2(clientList, list));
    }

    public static Map<SubscriptionType, Long> countClientSubscriptions(List<Client> clients, List<Subscription> subscriptions) {
        Map<SubscriptionType, Long> result = Collections.emptyMap();

        if (subscriptions == null || subscriptions.isEmpty()) {
            return result;
        }
        Map<String, SubscriptionType> stringSubscriptionTypeMap =
                subscriptions
                        .stream()
                        .filter(x -> x.getType() != null || x.getSubscriptionId() != null)
                        .collect(Collectors.toMap(Subscription::getSubscriptionId, Subscription::getType));
        if (clients == null || clients.isEmpty()) {
            result =
                    stringSubscriptionTypeMap
                            .entrySet()
                            .stream()
                            .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.counting()));
        } else {
            result =
                    clients
                            .stream()
                            .map(Client::getSubscriptionIds)
                            .flatMap(Collection::stream)
                            .map(stringSubscriptionTypeMap::get)
                            .filter(Objects::nonNull)
                            .collect(Collectors.groupingBy(k -> k, Collectors.counting()));
        }
        return result;
    }

    public static Map<SubscriptionType, Long> countClientSubscriptions2(List<Client> clients, List<Subscription> subscriptions) {
//        clients.stream().flatMap(Client::getSubscriptionIds).;
//        StringBuilder
        return Collections.emptyMap();
    }

    public static class Client {
        private final List<String> subscriptionIds;

        public Client(List<String> subscriptionIds) {
            this.subscriptionIds = subscriptionIds;
        }

        public List<String> getSubscriptionIds() {
            return subscriptionIds;
        }
    }

    public static class Subscription {
        private final String subscriptionId;
        private final SubscriptionType type;

        public Subscription(String subscriptionId, SubscriptionType type) {
            this.subscriptionId = subscriptionId;
            this.type = type;
        }

        public String getSubscriptionId() {
            return subscriptionId;
        }

        public SubscriptionType getType() {
            return type;
        }
    }

    public enum SubscriptionType {
        ANNUAL, QUARTERLY, MONTHLY
    }
}